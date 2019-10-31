package model;

public class Team {
    private String id;
    private String leagueId;
    private String username;
    private String name;
    private String[] playerIds;

    public Team() {}

    public Team(String username, String teamname) {
        this.username = username;
        this.name = teamname;
    }

    public Team(String id, String leagueId, String username, String name, String[] playerIds) {
        this.id = id;
        this.leagueId = leagueId;
        this.username = username;
        this.name = name;
        this.playerIds = playerIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPlayerIds() {
        return playerIds;
    }

    public void setPlayerIds(String[] playerIds) {
        this.playerIds = playerIds;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj instanceof Team) {
            Team tmp = (Team) obj;

            if (this.id.equals(tmp.id) &&
                this.name.equals(tmp.name) &&
                this.leagueId.equals(tmp.leagueId) &&
                this.username.equals(tmp.username) &&
                this.playerIds.equals(tmp.playerIds)
            ) {
                return true;
            }
        }

        return false;
    }
}
