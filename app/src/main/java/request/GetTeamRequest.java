package request;

public class GetTeamRequest {
    private String username;
    private String password;
    private String teamName;

    public GetTeamRequest() {}

    public GetTeamRequest(String username, String password, String teamName) {
        this.username = username;
        this.password = password;
        this.teamName = teamName;
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
