package org.vikas.shapeFactory;

public class Rectangle implements Shape{

    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",breadth=" + breadth + "]";
    }
}
