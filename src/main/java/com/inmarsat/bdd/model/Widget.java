package com.inmarsat.bdd.model;

public class Widget {

    private String colour;

    public String getColour() {
        return colour;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    private int length;
    private int width;

    public Widget(String colour, int length, int width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }
}
