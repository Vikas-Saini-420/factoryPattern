package org.vikas.shapeFactory;

public class RectangleFactory extends shapeFactory{
    @Override
    public Shape getShape(double... args) {
        if(args.length != 2){
            throw new IllegalArgumentException("Invalid number of arguments");
        }
        return new Rectangle(args[0], args[1]);
    }
}
