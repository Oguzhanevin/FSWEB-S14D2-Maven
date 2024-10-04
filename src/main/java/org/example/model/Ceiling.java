package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    // Instance variables
    private int height;
    private PaintColor color;

    // Constructor
    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Getter for color
    public PaintColor getColor() {
        return color;
    }

    // create method
    public void create() {
        System.out.println("Ceiling has been built.");
    }
}
