package models;

/**
 * The User class represents a standard user within the Flavorshare application.
 * It encapsulates user information and provides controlled access to it.
 * <p>
 * Demonstrates the OOP concept of <b>encapsulation</b> by using private fields and public accessors.
 * </p>
 * 
 * @author Nicolas Soriano Medina - Nathely Sanabria Peña - Juan Jose Duran Quimbayo
 * @version 1.0
 */

public class User {
    private String username;
    private String password;
    private boolean isAdmin;

    /**
     * Constructor.
     * 
     * @param username The username chosen by the user.
     * @param password The password associated with the account.
     */

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAdmin = false;
    }

    // Getters and Setters (Encapsulation)

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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    /**
     * Displays the user's role in the system.
     * Can be overridden by subclasses to demonstrate polymorphism.
     */
    
    public void displayRole() {
        System.out.println("User role: Regular user");
    }
}

