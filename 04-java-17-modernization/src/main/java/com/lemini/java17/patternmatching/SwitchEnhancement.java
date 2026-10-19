package com.lemini.java17.patternmatching;

/**
 * 1. Modern switch expression with Arrow Syntax
 * 2. Modern switch expression with Yield
 * 3. Pattern Matching for instanceof
 */

public class SwitchEnhancement {

    /**
     * 1. Modern switch expression with Arrow Syntax
     * Notice there are no break statements in the switch cases, and the code is
     * more concise and readable.
     */

    public String getDayType(String day) {
        return switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
    }

    /**
     * 2. Modern switch expression with Yield
     * If you need multiple lines of logics inside a switch case,open a block{}
     * and use 'yield' keyword to return the value.
     */
    public int calculateProcessingTime(String taskLevel) {
        return switch (taskLevel.toUpperCase()) {
            case "FAST" -> 10;
            case "MEDIUM" -> 50;
            case "COMPLEX" -> {
                System.out.println("Executing complex calculations...");
                // 'yield' is the modern return for switch blocks
                yield 100;
            }
            default -> 0;
        };
    }

    /**
     * 3. Pattern Matching for instanceof
     * We declare the casted variable directly inside the if-statment!
     */
    public String processUnknowObject(Object obj) {
        // Old way: if (obj instanceof String) { String s = (String) obj; ... }
        // Modern way:
        if (obj instanceof String str && str.length() > 5) {
            return "Long String: " + str;
        } else if (obj instanceof String str) {
            return "Short String: " + str;
        } else if (obj instanceof Integer num && num > 100) {
            return "Large Number: " + num;
        } else if (obj instanceof Integer num) {
            return "Small Number: " + num;
        } else {
            return "Unknown Type";
        }
    }
}
