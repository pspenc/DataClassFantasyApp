package response;

import model.League;

// GET /league/{username}
public class UserLeaguesResponse extends Response {
    private League[] leagues;

    public UserLeaguesResponse() {}

    public UserLeaguesResponse(League[] leagues) {
        this.leagues = leagues;
    }

    public League[] getLeagues() {
        return leagues;
    }

    public void setLeagues(League[] leagues) {
        this.leagues = leagues;
    }
}
