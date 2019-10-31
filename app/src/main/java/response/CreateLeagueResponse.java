package response;

public class CreateLeagueResponse extends Response {
    private String leagueName;
    private String username;
    private String[] teamNames;

    public CreateLeagueResponse() {}

    public CreateLeagueResponse(String leagueName, String username, String[] teamNames) {
        this.leagueName = leagueName;
        this.username = username;
        this.teamNames = teamNames;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getTeamNames() {
        return teamNames;
    }

    public void setTeamNames(String[] teamNames) {
        this.teamNames = teamNames;
    }
}
