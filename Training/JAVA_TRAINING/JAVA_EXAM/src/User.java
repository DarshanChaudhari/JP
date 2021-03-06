/// Question 3. Create a Class with name “User” and with following properties:

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private String password;
    private String role;
    private String active;


    public User(String username, String password, String role, String active){
        this.username =username;
        this.password= password;
        this.role = role;
        this.active =active;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", active=" + active +
                '}';
    }
}
