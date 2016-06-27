package com.realdolmen.shapes;

import com.sun.javafx.geom.*;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Square extends Rectangle {

    public Square() {
    }


    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide (double side) {
        super.setLength(side);
        super.setWidth(side);

    }

    public void setLength (double side) {
        super.setLength(side);

    }

    @Override
    public String toString() {
        return "A Square{} with side " + super.getLength() + "and subclass is (" + super.toString() + ")";
    }

    public void setWidth (double side) {
        super.setWidth(side);

    }

}
