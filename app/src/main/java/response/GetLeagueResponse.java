package response;

import model.League;

public class GetLeagueResponse extends Response {
    private League league;
    private String[] teamnames;

    public GetLeagueResponse() {}

    public GetLeagueResponse(League league, String[] teamnames) {
        this.league = league;
        this.teamnames = teamnames;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public String[] getTeamnames() {
        return teamnames;
    }

    public void setTeamnames(String[] teamnames) {
        this.teamnames = teamnames;
    }
}
