package model;

/**
 * Object with data about each user that registers with Fantasy eSports
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String birthday;
    private String id;

    public User() {}

    public User(String username, String password, String email, String firstName,
                String lastName, String gender, String birthday) {

        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj instanceof User) {
            User temp = (User) obj;

            if (this.username.equals(temp.username) &&
                    this.password.equals(temp.password) &&
                    this.email.equals(temp.email) &&
                    this.firstName.equals(temp.firstName) &&
                    this.lastName.equals(temp.lastName) &&
                    this.birthday.equals(temp.birthday) &&
                    this.gender.equals(temp.gender)
            ) {
                return true;
            }
        }

        return false;
    }
}
