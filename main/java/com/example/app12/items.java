package com.TeamBee.WellbeingTracker.util;

import android.widget.ImageView;

public class items {
    private String image_name;
    private int image;

    //getters and setters for images and image name
    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }



    public items(int image, String image_name) {
        this.image = image;
        this.image_name = image_name;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
