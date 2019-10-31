package comm;

import comm.ClientCommunicator;
import request.*;
import response.*;

public class ServerProxy {
    public static final ServerProxy INSTANCE = new ServerProxy();
    private final ClientCommunicator comm = new ClientCommunicator();

    private ServerProxy(){}


    public void setTarget(String host, int port){
        comm.setTarget(host, port);
    }

    //LOGIN
    public LoginResponse login(LoginRequest request)
    {
        try{

            return comm.doRequest(LoginResponse.class, "login", request);
        }catch (RuntimeException e){
            throw e;
        }catch (Exception e){
            throw new RuntimeException("Odd error in do request");
        }
    }

    //REGISTER
    public RegisterResponse register(RegisterRequest request)
    {
        try{
            return comm.doRequest(LoginResponse.class, "login", request);
        }catch (RuntimeException e){
            throw e;
        }catch (Exception e){
            throw new RuntimeException("Odd error in do request");
        }
    }

    public GetLeagueResponse getLeague(GetLeagueRequest request)
    {
        try{
            return comm.doRequest(LoginResponse.class, "login", request);
        }catch (RuntimeException e){
            throw e;
        }catch (Exception e){
            throw new RuntimeException("Odd error in do request");
        }
    }

    public GetTeamResponse getTeam(GetTeamRequest request)
    {
        try{

            return comm.doRequest(LoginResponse.class, "login", request);
        }catch (RuntimeException e){
            throw e;
        }catch (Exception e){
            throw new RuntimeException("Odd error in do request");
        }
    }

    public UserLeaguesResponse getUserLeagues(UserLeaguesRequest request)
    {
        try{
            return comm.doRequest(LoginResponse.class, "login", request);
        }catch (RuntimeException e){
            throw e;
        }catch (Exception e){
            throw new RuntimeException("Odd error in do request");
        }
    }



}
