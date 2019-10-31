package helper;

import java.io.*;
import request.*;
import com.google.gson.*;
import response.CreateLeagueResponse;

/**
 * Class to turn json into java objects
 */
public class Decoder {
    public Decoder() {}

    public static RegisterRequest decodeRegisterRequest(Reader json) {
        return new Gson().fromJson(json, RegisterRequest.class);
    }

    public static LoginRequest decodeLoginRequest(Reader json) {
        return new Gson().fromJson(json, LoginRequest.class);
    }

    public static UserLeaguesRequest decodeUserLeaguesRequest(Reader json) {
        return new Gson().fromJson(json, UserLeaguesRequest.class);
    }

    public static CreateLeagueRequest decodeCreateLeagueRequest(Reader json) {
        return new Gson().fromJson(json, CreateLeagueRequest.class);
    }

    public static GetLeagueRequest decodeGetLeagueRequest(Reader json) {
        return new Gson().fromJson(json, GetLeagueRequest.class);
    }

    public static GetTeamRequest decodeGetTeamRequest(Reader json) {
        return new Gson().fromJson(json, GetTeamRequest.class);
    }
}
