package com.lemini.javacore.fundamentals.basics.staticmembers;

import com.lemini.javacore.fundamentals.basics.methods.staticmethods.NumberUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void shouldRecognizeEvenNumbers() {
        assertTrue(NumberUtils.isEven(2));
        assertTrue(NumberUtils.isEven(100));
    }

    @Test
    void shouldRecognizeOddNumbers() {
        assertFalse(NumberUtils.isEven(3));
        assertFalse(NumberUtils.isEven(99));
    }

    @Test
    void shouldHandleZeroAndNegativeNumbers() {
        assertTrue(NumberUtils.isEven(0));
        assertTrue(NumberUtils.isEven(-4));
        assertFalse(NumberUtils.isEven(-7));
    }

}
