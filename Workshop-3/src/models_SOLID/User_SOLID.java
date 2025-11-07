package models_SOLID;

/**
 * The User class represents a standard user in the FlavorShare platform.
 * 
 * <p>
 * This class follows the <b>Single Responsibility Principle (SRP)</b> by 
 * focusing only on user data and basic authentication behavior.
 * It no longer handles administrative logic or roles directly, ensuring 
 * a clear separation between user identity and permissions.
 * </p>
 * 
 * <p>
 * The design also adheres to the <b>Liskov Substitution Principle (LSP)</b>, 
 * allowing any subclass (e.g., Admin, Moderator, or Viewer) to replace User 
 * instances without affecting program correctness.
 * </p>
 * 
 * <p>
 * Future user types can extend this class and override behavior if needed, 
 * while keeping the base logic consistent.
 * </p>
 * 
 * @author Nicolás Soriano Medina - Nathaly Sanabria Peña - Juan José Durán Quimbayo
 * @version 2.0
 */
public class User_SOLID {

    /** Username used for login and identification. */
    private String username;

    /** Password used for authentication. */
    private String password;

    /** 
     * Constructs a new user with a given username and password.
     * 
     * @param username the unique username
     * @param password the password associated with the user
     */
    public User_SOLID(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ---------------------- Getters and Setters ----------------------

    /**
     * Gets the username of the user.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Updates the username of the user.
     * @param username new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the user's password.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Updates the user's password.
     * @param password new password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    // ---------------------- Functional Behavior ----------------------

    /**
     * Simulates a login action.
     * In a future version, this could connect to an authentication service.
     */
    public void login() {
        System.out.println("Welcome back, " + username + "!");
    }

    /**
     * Displays general user information (non-sensitive).
     */
    public void displayInfo() {
        System.out.println("User Information:");
        System.out.println("- Username: " + username);
    }

    /**
     * Displays the user's role.
     * <p>
     * Regular users have limited access, while administrators or other 
     * subclasses can override this method to specify their roles.
     * </p>
     */
    public void displayRole() {
        System.out.println("Role: Regular User");
    }

    // ---------------------- Utility Methods ----------------------

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
