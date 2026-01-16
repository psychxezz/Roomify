package roomify.controller;

import roomify.model.DataStore;
import roomify.model.user;

public class AuthController {

    public AuthController() {
        DataStore.seed();
    }

    public user login(String username, String password, String role) {

        DataStore.seed(); // safe

        if (username == null || password == null || role == null) return null;

        username = username.trim();
        password = password.trim();
        role = role.trim();

        user u = DataStore.findUserByUsername(username);
        if (u == null) return null;

        // password check
        if (u.password == null || !u.password.equals(password)) return null;

        // role check (IMPORTANT)
        if (u.role == null || !u.role.trim().equalsIgnoreCase(role)) return null;

        return u;
    }

    public boolean usernameExists(String username) {
        DataStore.seed();
        return DataStore.findUserByUsername(username) != null;
    }

    public boolean register(String username, String password, String role) {

        DataStore.seed();

        if (username == null || password == null || role == null) return false;

        username = username.trim();
        password = password.trim();
        role = role.trim();

        if (username.isEmpty() || password.isEmpty()) return false;

        // IMPORTANT: normalize role so it always matches login combo box
        if (role.equalsIgnoreCase("member")) role = "Member";
        if (role.equalsIgnoreCase("admin")) role = "Admin";

        if (usernameExists(username)) return false;

        return DataStore.addUser(new user(username, password, role));
    }
}
