package com.example.a09_recycleviewcardview;

public class Cat {
    private int sourceImage;
    private String name;
    public Cat(int sourceImage, String name) {
        this.sourceImage = sourceImage;
        this.name = name;
    }
    public int getSourceImage() {
        return sourceImage;
    }
    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
