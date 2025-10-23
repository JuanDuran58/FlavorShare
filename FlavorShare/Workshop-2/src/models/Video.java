package models;

/**
 * The Video class represents a short cooking video in Flavorshare.
 * <p>
 * It can be associated with a Recipe, showing a clear example of
 * object composition within the system.
 * </p>
 * 
 * @author Nicolas Soriano Medina - Nathely Sanabria Peña - Juan Jose Duran Quimbayo
 * @version 1.0
 */

public class Video {

    private String videoTitle;
    private int duration; // in seconds
    private String uploader;

    public Video(String videoTitle, int duration, String uploader) {
        this.videoTitle = videoTitle;
        this.duration = duration;
        this.uploader = uploader;
    }

    public void showVideoInfo() {
        System.out.println("Video: " + videoTitle + " (" + duration + " sec)");
        System.out.println("Uploaded by: " + uploader);
    }

    // Getters and Setters

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }
}
