package org.vikas.shapeFactory;

public abstract class shapeFactory {
    // create default constructor
    public shapeFactory() {
    }
    // create abstract method getShape()
    public abstract Shape getShape(double... args);
}
