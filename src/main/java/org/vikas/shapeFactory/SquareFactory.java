package org.vikas.shapeFactory;

public class SquareFactory extends shapeFactory{

    @Override
    public Shape getShape(double... args) {
        if(args.length != 1){
            throw new IllegalArgumentException("Invalid number of arguments");
        }
        return new Square(args[0]);
    }
}
