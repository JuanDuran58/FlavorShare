package models;

/**
 * The Recipe class represents a cooking recipe uploaded by a user or an admin
 * in the Flavorshare application.
 * <p>
 * Demonstrates the OOP concept of <b>composition</b> because a Recipe object
 * contains a {@link Video} object as one of its components.
 * </p>
 * 
 * @author Nicolas Soriano Medina - Nathely Sanabria Peña - Juan Jose Duran Quimbayo
 * @version 1.0
 */
public class Recipe {

    private String title;
    private String description;
    private String[] ingredients;
    private Video video; // composition: a Recipe "has a" Video

    /**
     * Constructs a Recipe with a title, description, list of ingredients, and video.
     * 
     * @param title       The recipe's title.
     * @param description A short description of the recipe.
     * @param ingredients A list of ingredients used in the recipe.
     * @param video       The video associated with the recipe.
     */
    public Recipe(String title, String description, String[] ingredients, Video video) {
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.video = video;
    }

    /**
     * Displays basic information about the recipe.
     */
    public void showRecipeInfo() {
        System.out.println("Recipe: " + title);
        System.out.println("Description: " + description);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println(" - " + ingredient);
        }
        if (video != null) {
            video.showVideoInfo();
        }
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
