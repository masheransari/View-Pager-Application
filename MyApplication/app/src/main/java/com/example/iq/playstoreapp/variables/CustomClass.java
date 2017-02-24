package com.example.iq.playstoreapp.variables;

/**
 * Created by iQ on 2/24/2017.
 */

public class CustomClass {
    private int app_image_id;
    private String app_name;
    private double rating;

    public CustomClass(String app_name, double rating,int app_image_id) {
        this.app_image_id = app_image_id;
        this.app_name = app_name;
        this.rating = rating;
    }

    public int getApp_image_id() {
        return app_image_id;
    }

    public String getApp_name() {
        return app_name;
    }

    public double getRating() {
        return rating;
    }
}
