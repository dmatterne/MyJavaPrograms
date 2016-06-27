package com.realdolmen.shapes;

/**
 * Created by David on 6/06/2016.
 */
public class ResizableCircle extends Circles implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
       super.setRadius(super.getRadius() * percent / 100);
    }
}
