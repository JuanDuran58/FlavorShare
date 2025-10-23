import models.*;

/**
 * Entry point for the Flavorshare application.
 * <p>
 * This class demonstrates how the main entities interact:
 * Users, Admins, Recipes, and Videos.
 * <br>
 * It serves as a simple prototype to show the use of
 * encapsulation, inheritance, polymorphism, and composition.
 * </p>
 * 
 * @author Nicolas Soriano Medina - Nathely Sanabria Peña - Juan Jose Duran Quimbayo
 * @version 1.0
 */
public class App {

    /**
     * Main method that executes a simple simulation of Flavorshare.
     * Demonstrates object creation, inheritance, and interactions between classes.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // ---------------------------------------
        // 1. Create a regular user
        // ---------------------------------------
        User user = new User("nicolas", "1234");
        user.displayRole();

        // ---------------------------------------
        // 2. Create an admin (inherits from User)
        // ---------------------------------------
        Admin admin = new Admin("juan", "abcd", "ADM001");
        admin.displayRole();
        admin.uploadVideo("Postres de Nat");

        // ---------------------------------------
        // 3. Create a video (composition)
        // ---------------------------------------
        Video video = new Video("Postres de Nat", 60, admin.getUsername());

        // ---------------------------------------
        // 4. Create a recipe containing that video
        // ---------------------------------------
        String[] ingredients = {"A", "B", "C", "D"};
        Recipe recipe = new Recipe("Postres de Nat", "Postres de Nat", ingredients, video);

        // ---------------------------------------
        // 5. Display recipe information
        // ---------------------------------------
        System.out.println("\n--- RECIPE DETAILS ---");
        recipe.showRecipeInfo();

        // ---------------------------------------
        // 6. End of demonstration
        // ---------------------------------------
        System.out.println("\nEnd of simulation.");
    }
}
