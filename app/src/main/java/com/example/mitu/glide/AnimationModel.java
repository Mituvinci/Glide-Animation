package com.example.mitu.glide;

/**
 * Created by mitu on 4/12/16.
 */
public class AnimationModel {
    int id;
    String image_animation;

    public AnimationModel(int id, String image_animation) {
        this.id = id;
        this.image_animation = image_animation;
    }

    public AnimationModel(String image_animation) {
        this.image_animation = image_animation;
    }

    public int getId() {
        return id;
    }

    public String getImage_animation() {
        return image_animation;
    }
}
