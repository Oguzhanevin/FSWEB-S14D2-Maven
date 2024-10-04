package org.example.model;

public class Wardrobe {
    // Instance variables
    private int width;
    private int height;
    private double weight;

    // Constructor
    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Getter for width
    public int getWidth() {
        return width;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // add method
    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }
}

