package model;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Integer group_id;

    public User(){}

    public User(String username, String email, String password, Integer group_id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.group_id = group_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    @Override
    public String toString(){
        return id + " " + username + " " + email + " " + group_id;
    }
}
