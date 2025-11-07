import models_SOLID.*;

/**
 * Demonstration class for the SOLID refactored FlavorShare system.
 *
 * <p>
 * This application illustrates how the updated architecture complies 
 * with SOLID principles by creating users, admins, recipes, videos, 
 * and managing likes in a modular and maintainable way.
 * </p>
 *
 * <p>
 * Principles applied:
 * <ul>
 *   <li><b>SRP</b> — Each class has a single responsibility.</li>
 *   <li><b>OCP</b> — Classes are open for extension, closed for modification.</li>
 *   <li><b>LSP</b> — Substitutions work seamlessly (e.g., Admin_SOLID extends User_SOLID).</li>
 *   <li><b>ISP</b> — Only necessary interfaces are implemented.</li>
 *   <li><b>DIP</b> — High-level classes depend on abstractions, not details.</li>
 * </ul>
 * </p>
 *
 * @author Nicolás Soriano Medina - Nathaly Sanabria Peña - Juan José Durán Quimbayo
 * @version 2.0
 */
public class App_SOLID {

    public static void main(String[] args) {

        System.out.println("=== FLAVORSHARE — SOLID IMPLEMENTATION DEMO ===\n");

        // Create the Recipe Manager (DIP example)
        RecipeManager_SOLID recipeManager = new RecipeManager_SOLID();

        // Create the Admin (depends on abstraction, not implementation)
        Admin_SOLID admin = new Admin_SOLID("adminCarlos", "securePass", "ADM001", recipeManager);

        // Create a video (the only entity that can receive likes)
        Video_SOLID video = new Video_SOLID("Chocolate Cake Tutorial", "Dessert", "05:32");

        // Create a recipe associated with that video
        Recipe_SOLID recipe = new Recipe_SOLID(
            "Chocolate Cake",
            "Mix ingredients, bake, and decorate.",
            "Nicolás Soriano",
            "Dessert",
            video
        );

        // Admin adds the recipe to the system
        admin.addRecipe(recipe);

        // Display all recipes
        System.out.println();
        recipeManager.listRecipes();

        // Create a regular user
        User_SOLID user = new User_SOLID("nathyUser", "abc123");

        // User gives a like to the video
        Like_SOLID like = new Like_SOLID(user, video);

        // Display recipe info (shows likes via video)
        System.out.println();
        recipe.displayRecipe();

        // Display video info
        System.out.println();
        video.displayVideo();

        // Display like info
        System.out.println();
        like.displayLikeInfo();

        System.out.println("\n=== END OF SOLID DEMO ===");
    }
}
