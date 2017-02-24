package com.example.sky.recyclerviewbeat;

/**
 * Created by sky on 2017/2/24.
 */

public class Fruit {
    private String name;
    private int imageId;
    private String test;
    private String test2;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
