package com.example.techjourneycompanion;

public class ImageDetails {
    private String title;
    private String category;
    private String description;

    public ImageDetails(String title, String category, String description) {
        this.title = title;
        this.category = category;
        this.description = description;
    }
    public String gettitle() {
        return title;
    }
    public String getcategory() {
        return category;
    }
    public String getdescription() {
        return description;
    }
}
