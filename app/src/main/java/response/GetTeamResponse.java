package response;

import model.Team;

public class GetTeamResponse extends Response {
    private Team team;

    public GetTeamResponse() {}

    public GetTeamResponse(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
