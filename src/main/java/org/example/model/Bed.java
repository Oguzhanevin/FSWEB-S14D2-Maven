package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    // getStyle method
    public String getStyle() {
        return style;
    }

    // other methods
    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}
