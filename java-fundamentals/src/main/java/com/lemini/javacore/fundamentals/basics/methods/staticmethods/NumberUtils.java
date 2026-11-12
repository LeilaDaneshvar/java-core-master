package com.lemini.javacore.fundamentals.basics.methods.staticmethods;

public class NumberUtils {

    private NumberUtils() {
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
