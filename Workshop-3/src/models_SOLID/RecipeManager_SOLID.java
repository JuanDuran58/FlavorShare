package models_SOLID;

import java.util.ArrayList;
import java.util.List;

/**
 * The RecipeManager_SOLID class is responsible for managing recipes 
 * in the FlavorShare platform.
 *
 * <p>
 * It follows the <b>Single Responsibility Principle (SRP)</b> by 
 * handling only operations related to recipe storage and management.
 * </p>
 *
 * <p>
 * Each recipe is associated with a single video, so likes are tracked 
 * within the {@link Video_SOLID} class, not here.
 * </p>
 *
 * <p>
 * This class also respects the <b>Dependency Inversion Principle (DIP)</b> 
 * since higher-level modules (like {@link Admin_SOLID}) depend on this abstraction 
 * rather than implementing management logic directly.
 * </p>
 *
 * @author Nicolás Soriano Medina - Nathaly Sanabria Peña - Juan José Durán Quimbayo
 * @version 1.0
 */
public class RecipeManager_SOLID {

    /** List that simulates a recipe repository (temporary in-memory storage). */
    private List<Recipe_SOLID> recipes;

    /**
     * Constructs a new RecipeManager_SOLID with an empty recipe list.
     */
    public RecipeManager_SOLID() {
        this.recipes = new ArrayList<>();
    }

    // ---------------------- Core Methods ----------------------

    /**
     * Adds a new recipe to the repository.
     *
     * @param recipe the recipe to add
     */
    public void addRecipe(Recipe_SOLID recipe) {
        recipes.add(recipe);
        System.out.println("Recipe added successfully: " + recipe.getTitle() +
                           " | Video: " + recipe.getVideo().getTitle());
    }

    /**
     * Deletes a recipe from the repository by its title.
     *
     * @param title the title of the recipe to remove
     */
    public void deleteRecipe(String title) {
        boolean removed = recipes.removeIf(r -> r.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Recipe deleted successfully: " + title);
        } else {
            System.out.println("Recipe not found: " + title);
        }
    }

    /**
     * Lists all stored recipes, including their associated videos and like counts.
     */
    public void listRecipes() {
        System.out.println("=== Recipe List ===");
        if (recipes.isEmpty()) {
            System.out.println("No recipes available.");
        } else {
            for (Recipe_SOLID r : recipes) {
                System.out.println("- " + r.getTitle() + " | Video: " + r.getVideo().getTitle() +
                                   " | Likes: " + r.getVideo().getLikes());
            }
        }
    }

    /**
     * Returns all recipes as a list.
     *
     * @return the list of recipes
     */
    public List<Recipe_SOLID> getRecipes() {
        return recipes;
    }

    /**
     * Searches for a recipe by title.
     *
     * @param title the recipe title to search for
     * @return the recipe if found, or null if not found
     */
    public Recipe_SOLID findRecipeByTitle(String title) {
        for (Recipe_SOLID recipe : recipes) {
            if (recipe.getTitle().equalsIgnoreCase(title)) {
                return recipe;
            }
        }
        return null;
    }
}
