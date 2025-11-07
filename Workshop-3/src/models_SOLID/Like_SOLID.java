package models_SOLID;

import java.time.LocalDateTime;

/**
 * The Like_SOLID class represents a "like" action performed by a user on a video.
 *
 * <p>
 * When created, this class automatically increments the like counter of the
 * associated video. Each like is linked to a specific user and timestamp.
 * </p>
 *
 * <p>
 * This design follows the <b>Single Responsibility Principle (SRP)</b> by
 * focusing only on user–video relationships, and the
 * <b>Open/Closed Principle (OCP)</b> by allowing future extensions such as
 * reactions or favorites without modifying this class.
 * </p>
 *
 * @author Nicolás Soriano Medina - Nathaly Sanabria Peña - Juan José Durán Quimbayo
 * @version 1.0
 */
public class Like_SOLID {

    /** The user who gave the like. */
    private User_SOLID user;

    /** The video that received the like. */
    private Video_SOLID video;

    /** Date and time when the like was created. */
    private LocalDateTime date;

    /**
     * Creates a new like from a user to a specific video.
     *
     * <p>This constructor also increments the like counter of the video.</p>
     *
     * @param user  the user who gave the like
     * @param video the video that received the like
     */
    public Like_SOLID(User_SOLID user, Video_SOLID video) {
        this.user = user;
        this.video = video;
        this.date = LocalDateTime.now();
        this.video.addLike(); // Updates like count automatically
    }

    // ---------------------- Getters ----------------------

    public User_SOLID getUser() {
        return user;
    }

    public Video_SOLID getVideo() {
        return video;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // ---------------------- Behavior ----------------------

    /**
     * Displays information about this like action.
     */
    public void displayLikeInfo() {
        System.out.println(user.getUsername() + " liked the video \"" + video.getTitle() + "\" on " + date);
    }

    /**
     * Returns a readable string representation of the like.
     */
    @Override
    public String toString() {
        return user.getUsername() + " liked \"" + video.getTitle() + "\" (" + date + ")";
    }
}
