package com.lemini.modern.sealedclasses;

final class Square extends Rectangle {

    // A square just passes the same value for length and width to the Rectangle parent
    public Square(double side) {
        super(side, side);
    }

}
