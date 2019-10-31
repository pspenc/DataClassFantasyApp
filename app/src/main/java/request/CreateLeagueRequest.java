package request;

import model.Team;

public class CreateLeagueRequest {
    private String username;
    private String password;
    private String leagueName;
    private Team[] teams;

    public CreateLeagueRequest() {}

    public CreateLeagueRequest(String username, String password, String leagueName, Team[] teams) {
        this.username = username;
        this.password = password;
        this.teams = teams;
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

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
