package model;

/**
 * Object representing a league. Has id, league name, and id of the user that created it
 */
public class League {
    private String id;
    private String name;
    private String username;
    private boolean draftComplete;

    public League() {}

    public League(String id, String name, String username, boolean draftComplete) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isDraftComplete() {
        return draftComplete;
    }

    public void setDraftComplete(boolean draftComplete) {
        this.draftComplete = draftComplete;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return  false;
        }

        if (obj == this) {
            return true;
        }

        if (obj instanceof  League) {
            League tmp = (League) obj;

            if (this.id.equals(tmp.id) &&
                this.name.equals(tmp.name) &&
                this.username.equals(tmp.username)
            ) {
                return true;
            }
        }

        return false;
    }
}
