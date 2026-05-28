package com.lemini.java17.sealedclasses;

/**
 * Sealed Classes allow you to lock down your architecture by explicitly stating
 * exactly which classes are permitted to inherit from a parent.
 */
public sealed interface Shape permits Circle, Rectangle {

    // All shapes must be able to calculate their area
    public abstract double calculateArea();

}
