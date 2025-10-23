package models;

/**
 * The Admin class represents a special type of user with elevated privileges
 * within the Flavorshare system.
 * <p>
 * This class demonstrates the Object-Oriented principle of <b>inheritance</b>
 * by extending the {@link User} class, and <b>polymorphism</b> through method
 * overriding.
 * </p>
 * 
 * Admin users are responsible for uploading, editing, and managing recipe videos.
 * 
 * @author Nicolas Soriano Medina - Nathely Sanabria Peña - Juan Jose Duran Quimbayo
 * @version 1.0
 */

public class Admin extends User {
    private String adminCode; // additional field unique to admins

    /**
     * Constructs an Admin with a username, password, and admin code.
     *
     * @param username the admin's username
     * @param password the admin's password
     * @param adminCode a special code identifying admin privileges
     */
    public Admin(String username, String password, String adminCode) {
        super(username, password); // call the constructor of the superclass (User)
        this.adminCode = adminCode;
        setAdmin(true); // inherited setter from User
    }

    /**
     * Allows the admin to upload a recipe video.
     * In a real implementation, this method would interact with a database
     * or file storage system.
     *
     * @param recipeTitle the title of the recipe video
     */
    public void uploadVideo(String recipeTitle) {
        System.out.println(getUsername() + " uploaded a new recipe: " + recipeTitle);
    }

    /**
     * Overrides the displayRole method from the User class.
     * Demonstrates polymorphism by providing a specific implementation for admins.
     */
    @Override
    public void displayRole() {
        System.out.println("User role: Administrator");
    }

    // ---------------------------
    // Getters and Setters
    // ---------------------------

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }
}
