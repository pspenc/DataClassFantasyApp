package comm;

import android.os.Build;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;

import java.io.PrintWriter;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import androidx.annotation.RequiresApi;
import helper.Encoder;

public class ClientCommunicator {

    Gson gson = new Gson();

    private String host = "localhost";
    private int port = 30000;

    public void setTarget(String host, int port) {
        this.host = host;
        this.port = port;
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public <T> T doRequest(Type returnType, String urlPath, Object requestBody) throws Exception {
        // Prepend slash
        if (!urlPath.startsWith("/")) urlPath = "/" + urlPath;

        // Get Gson instance
        //final Gson gson = TtrGson.INSTANCE;

        final URL url = makeUrl(urlPath);

        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (requestBody != null) {
                conn.setDoOutput(true);
            }

            conn.setConnectTimeout(1200);
            conn.connect();

            // Write request body
            if (requestBody != null) {

                try (PrintWriter w = new PrintWriter(conn.getOutputStream())) {

                    gson.toJson(requestBody, w);

                }
            }

            // Check response code
            final int code = conn.getResponseCode();
            if ( code == HttpURLConnection.HTTP_OK ) {
                // Read response body
                try (Reader in = new InputStreamReader(conn.getInputStream()) ) {
                    return gson.fromJson(in, returnType);
                }
            } else {
                // Read response body as error
                try (Reader in = new InputStreamReader(conn.getErrorStream()) ) {

                    Exception e = new Exception();
                    // Show a stack trace from here, instead of from getException:
                    e.fillInStackTrace();
                    throw e;
                }
            }


        } catch (IOException e) {
            throw new RuntimeException("Network error: " + e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private URL makeUrl(String urlPath) {
        final URL url;
        try {
            url = new URL("http", this.host, this.port, urlPath);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Something bad with url parts: http, "+this.host+", "+this.port+", "+urlPath);
        }
        return url;
    }

}


