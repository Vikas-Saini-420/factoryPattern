package org.vikas.shapeFactory;

public class TriangleFactory {

    public Shape getShape(double... args) {
        if(args.length != 3){
            throw new IllegalArgumentException("Triangle requires 3 arguments");
        }
        return new Triangle(args[0], args[1], args[2]);
    }
}
