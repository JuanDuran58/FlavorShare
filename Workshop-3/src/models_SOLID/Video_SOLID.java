package models_SOLID;

import java.util.UUID;

/**
 * The Video_SOLID class represents a video associated with a recipe 
 * in the FlavorShare platform.
 *
 * <p>
 * Each video can receive likes from users and is always linked to 
 * exactly one recipe. This ensures a one-to-one relationship between 
 * video and recipe content.
 * </p>
 *
 * <p>
 * The design follows the <b>Single Responsibility Principle (SRP)</b> 
 * by focusing solely on managing video information and user engagement 
 * (likes count). It also supports the <b>Open/Closed Principle (OCP)</b> 
 * by allowing extensions (e.g., new video formats or metadata) without 
 * modifying existing behavior.
 * </p>
 *
 * @author 
 * Nicolás Soriano Medina, Nathaly Sanabria Peña, Juan José Durán Quimbayo
 * @version 2.0 — Workshop 3 (2025-III)
 */
public class Video_SOLID {

    /** Unique identifier for each video (auto-generated). */
    private final String id;

    /** Video title (usually the same as the associated recipe title). */
    private String title;

    /** Video category or type (e.g., Dessert, Drink, Main Course). */
    private String category;

    /** Video duration as a string (e.g., "4:35"). */
    private String duration;

    /** Number of likes this video has received. */
    private int likes;

    /**
     * Constructs a new video with the given data.
     *
     * @param title    the title of the video
     * @param category the category or type of the video
     * @param duration the length of the video
     */
    public Video_SOLID(String title, String category, String duration) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.likes = 0;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getLikes() {
        return likes;
    }

    // ---------------------- Behavior ----------------------

    /**
     * Increments the like counter for this video.
     * Called automatically when a Like_SOLID is created.
     */
    public void addLike() {
        this.likes++;
    }

    /**
     * Displays the video information.
     */
    public void displayVideo() {
        System.out.println("=== Video Info ===");
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Duration: " + duration);
        System.out.println("Likes: " + likes);
        System.out.println("Video ID: " + id);
    }

    /**
     * Returns a formatted summary of the video.
     */
    @Override
    public String toString() {
        return String.format("%s [%s] — Duration: %s — Likes: %d", title, category, duration, likes);
    }
}
