package request;

public class GetLeagueRequest {
    private String username;
    private String password;
    private String leagueName;


    public GetLeagueRequest() {}

    public GetLeagueRequest(String username, String password, String leagueName) {
        this.username = username;
        this.password = password;
        this.leagueName = leagueName;
    }

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

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
