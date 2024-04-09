package org.vikas.shapeFactory;

public class TestShape {

    public TestShape(){
    }

    public void Test() {
        SquareFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.getShape(1000.0);
        System.out.printf("Square Area : '%,.2f' \n" , square.calculateArea());
        System.out.printf("Square Perimeter : '%.2f' \n" , square.calculatePerimeter());

        CircleFactory circleFactory = new CircleFactory();

        Shape circle = circleFactory.getShape(100.0);
        System.out.printf("Circle Area : '%.3f' \n" , circle.calculateArea() );
        System.out.printf("Circle Perimeter : '%.2f' \n " , circle.calculatePerimeter());

        RectangleFactory rectangleFactory = new RectangleFactory();

        Shape rectangle = rectangleFactory.getShape(10.0, 20.0);
        System.out.printf("Rectangle Area : '%.2f' \n" , rectangle.calculateArea());
        System.out.printf("Rectangle Perimeter : '%.2f' \n" , rectangle.calculatePerimeter());

        TriangleFactory triangleFactory = new TriangleFactory();

        Shape triangle = triangleFactory.getShape(10.0, 20.0, 25.0);
        System.out.printf("Triangle Area : '%.2f' \n" , triangle.calculateArea());
        System.out.printf("Triangle Perimeter : '%.2f' \n" , triangle.calculatePerimeter());
    }
}
