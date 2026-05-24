package com.lemini.modern.sealedclasses;

/**
 * A rectangle is a shape, but it can also be a parent. 
 * A Square is mathematically a specific type of Rectangle. 
 * So, we make Rectangle sealed and permit Square.
 */
sealed class Rectangle implements Shape permits Square {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    @Override
    public double calculateArea() {
        return length * width;
    }

}
