package com.lemini.modern.sealedclasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ShapeTest {

    @Test
    public void testCircleArea() {
        //Given
        Shape circle = new Circle(5);

        //when 
        double circleArea = circle.calculateArea();

        //then
       assertEquals(Math.PI * 25, circleArea, 0.01);
    }

    @Test
    public void testPatternMatchingWithSealedClasses() {
        //Given
        Shape shape = new Square(4);

        //when & then
        if (shape instanceof Square square) {
            assertEquals(16.0, square.calculateArea());
            
            // We can even call methods specific to the Rectangle parent
            assertEquals(4.0, square.getLength()); 
        } else {
            fail("The shape was not correctly identified as a Square");
        }
    }
}
