package Presenters;

import Fragments.LoginFragment;
import comm.ServerProxy;
import model.User;
import request.*;
import response.*;
import helper.SafeAsyncTask

public class LoginPresenter {

    private final LoginFragment fragment;

    public LoginPresenter(LoginFragment frag) {fragment = frag;}


    public void login(String username, String password, String hostname, String portNum){

        int intPortNum = Integer.parseInt(portNum);
        ServerProxy.INSTANCE.setTarget(hostname,intPortNum);
        LoginRequest request = new LoginRequest(username, password);

        //task.execute();
    }






    class LoginTask extends SafeAsyncTask<Void, Void, LoginResponse> {

        final String username;
        final String password;

        LoginTask(String username, String password) {
            this.username = username;
            this.password = password;
        }

        protected LoginResponse doInBackgroundSafe(Void... params)
        {
            LoginRequest req = new LoginRequest(new Username(username), password);
            try {
                return ServerProxy.INSTANCE.login(req);
            } catch (Exception e) {

                return new LoginResponse();
            }
        }

        protected void onPostSuccessfulExecute(LoginResponse result) {
            if (result.successful){
                User newUser = result.user;
                ClientModel.INSTANCE.setCurrentUserAndToken(newUser, result.token);
            }
            //fragment.loginSuccess(result);
        }
    }



}
