package models_SOLID;

/**
 * The Admin_SOLID class represents an administrator user in the FlavorShare platform.
 *
 * <p>
 * This class extends {@link User_SOLID} and follows the 
 * <b>Single Responsibility Principle (SRP)</b> by limiting its responsibility
 * to administrative identity and delegating content management operations
 * to the {@link RecipeManager_SOLID} service.
 * </p>
 *
 * <p>
 * The design also complies with the <b>Interface Segregation Principle (ISP)</b>
 * and <b>Dependency Inversion Principle (DIP)</b>: Admin depends on abstractions
 * (like RecipeManager_SOLID) instead of implementing its own management logic.
 * </p>
 *
 * <p>
 * This makes the class flexible, testable, and easy to maintain. 
 * Admin remains a user with elevated permissions, not a controller.
 * </p>
 *
 * @author Nicolás Soriano Medina - Nathaly Sanabria Peña - Juan José Durán Quimbayo
 * @version 2.0
 */
public class Admin_SOLID extends User_SOLID {

    /** Unique admin code for verification or role validation. */
    private String adminCode;

    /** A reference to the RecipeManager service (DIP applied). */
    private RecipeManager_SOLID recipeManager;

    /**
     * Creates a new Admin user with the given credentials and service dependency.
     * 
     * @param username the admin username
     * @param password the admin password
     * @param adminCode unique code for admin verification
     * @param recipeManager service used to manage recipes
     */
    public Admin_SOLID(String username, String password, String adminCode, RecipeManager_SOLID recipeManager) {
        super(username, password);
        this.adminCode = adminCode;
        this.recipeManager = recipeManager;
    }

    // ---------------------- Getters & Setters ----------------------

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public RecipeManager_SOLID getRecipeManager() {
        return recipeManager;
    }

    public void setRecipeManager(RecipeManager_SOLID recipeManager) {
        this.recipeManager = recipeManager;
    }

    // ---------------------- Behavior ----------------------

    @Override
    public void displayRole() {
        System.out.println("Role: Administrator");
    }

    /**
     * Delegates recipe creation to the RecipeManager service.
     * Demonstrates the application of the Dependency Inversion Principle.
     * 
     * @param recipe the recipe to add
     */
    public void addRecipe(Recipe_SOLID recipe) {
        recipeManager.addRecipe(recipe);
    }

    /**
     * Delegates recipe deletion to the RecipeManager service.
     * 
     * @param recipeTitle title of the recipe to remove
     */
    public void deleteRecipe(String recipeTitle) {
        recipeManager.deleteRecipe(recipeTitle);
    }

    /**
     * Displays admin-specific information.
     */
    @Override
    public void displayInfo() {
        System.out.println("Admin Information:");
        System.out.println("- Username: " + getUsername());
        System.out.println("- Admin Code: " + adminCode);
    }
}
