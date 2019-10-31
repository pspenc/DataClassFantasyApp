package request;

public class UserLeaguesRequest {
    private String username;
    private String password;

    public UserLeaguesRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserLeaguesRequest() { }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
