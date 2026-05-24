package com.lemini.modern.records;

/**
 * A simple Java 17 Record.
 * Notice how we don't need private final fields, constructors, getters, 
 * equals(), hashCode(), or toString(). The compiler generates them all!
 */
public record UserDTO(String username, String email, int age) {

    // You can still add custom validation inside a "Compact Constructor"
    public UserDTO {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

