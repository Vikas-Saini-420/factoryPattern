package org.vikas.shapeFactory;

public class Square implements Shape{

    private final double a;

    public Square(double a){
        this.a = a;
    }
    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }
}
