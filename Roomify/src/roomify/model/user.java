package roomify.model;

/**
 *
 * @author psychmist
 */
public class user {
     public final String username;
    public final String password;
    public final String role; // "Admin" or "Member"

    public user(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
}
