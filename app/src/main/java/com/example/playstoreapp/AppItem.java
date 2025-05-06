package com.example.playstoreapp;

public class AppItem {
    private int imageResId;
    private String name;
    private String category;
    private String rating;
    public AppItem(int imageResId, String name, String category, String rating) {
        this.imageResId = imageResId;
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getCategory() {
        return category;
    }
    public String getRating() {
        return rating;
    }
}
