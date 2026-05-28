package com.lemini.java17.sealedclasses;

/**
 * A circle is a fundamental shape. It shouldn't be extended. We lock it down with final.
 */
final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
