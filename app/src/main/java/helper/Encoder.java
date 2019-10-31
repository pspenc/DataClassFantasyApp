package helper;

import request.*;
import response.*;

import com.google.gson.*;

/**
 * Class to encode java objects to json
 */
public class Encoder {
    public Encoder() {}

    public static String encode(RegisterRequest request) {
        return new Gson().toJson(request);
    }

    public static String encode(RegisterResponse response) {
        return new Gson().toJson(response);
    }

    public static String encode(LoginResponse response) {
        return new Gson().toJson(response);
    }

    public static String encode(UserLeaguesResponse response) {
        return new Gson().toJson(response);
    }

    public static String encode(CreateLeagueResponse response) {
        return new Gson().toJson(response);
    }

    public static String encode(GetLeagueResponse response) {
        return new Gson().toJson(response);
    }

    public static String encode(GetTeamResponse response) {
        return new Gson().toJson(response);
    }
}
