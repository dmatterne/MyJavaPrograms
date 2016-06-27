package com.realdolmen.theory;

import com.realdolmen.shapes.Rectangle;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Square extends com.realdolmen.theory.Rectangle {

    public Square() {
    }


    public Square(double side) {
        super(side,side);
    }


    public double getSide() {
        return super.getWidth();
    }

    public void setSide (double side) {
        super.setHeight(side);
        super.setWidth(side);

    }

    public void setLength (double side) {
        super.setHeight(side);

    }

    @Override
    public String toString() {
        return "A Square{} with side " + super.getHeight() + "and subclass is (" + super.toString() + ")";
    }

    public void setWidth (double side) {
        super.setWidth(side);

    }

}
