package models_SOLID;

import java.util.UUID;

/**
 * The Recipe_SOLID class represents a recipe in the FlavorShare platform.
 *
 * <p>
 * Each recipe is associated with exactly one video, ensuring a one-to-one 
 * relationship between textual recipe content and its multimedia representation.
 * </p>
 *
 * <p>
 * Recipes themselves do not receive likes; all engagement is managed 
 * through their associated video.
 * </p>
 *
 * <p>
 * This class follows the <b>Single Responsibility Principle (SRP)</b> 
 * by handling only the descriptive and textual aspects of a recipe, 
 * and the <b>Open/Closed Principle (OCP)</b> by allowing extensions 
 * (e.g., adding metadata or tags) without modifying the core behavior.
 * </p>
 *
 * @author Nicolás Soriano Medina - Nathaly Sanabria Peña - Juan José Durán Quimbayo
 * @version 2.0
 */
public class Recipe_SOLID {

    /** Unique identifier for each recipe (auto-generated). */
    private final String id;

    /** Recipe title. */
    private String title;

    /** Recipe description or preparation steps. */
    private String description;

    /** Author username (creator). */
    private String author;

    /** Recipe category (optional, e.g., Dessert, Main Course, Drink). */
    private String category;

    /** The video associated with this recipe (1:1 relationship). */
    private Video_SOLID video;

    /**
     * Constructs a new recipe with the given data and associated video.
     *
     * @param title       the recipe title
     * @param description the recipe description
     * @param author      the author’s name
     * @param category    the recipe category
     * @param video       the associated video
     */
    public Recipe_SOLID(String title, String description, String author, String category, Video_SOLID video) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.author = author;
        this.category = category;
        this.video = video;
    }

    // ---------------------- Getters & Setters ----------------------

    public String getId() {
        return id;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Video_SOLID getVideo() {
        return video;
    }

    public void setVideo(Video_SOLID video) {
        this.video = video;
    }

    // ---------------------- Behavior ----------------------

    /**
     * Displays recipe details, including information about its associated video.
     */
    public void displayRecipe() {
        System.out.println("=== Recipe Info ===");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Associated Video: " + video.getTitle());
        System.out.println("Likes (via Video): " + video.getLikes());
    }

    /**
     * Converts the recipe information into a summary string.
     *
     * @return formatted string containing key recipe details
     */
    @Override
    public String toString() {
        return String.format("%s by %s [%s] — Likes: %d", title, author, category, video.getLikes());
    }
}
