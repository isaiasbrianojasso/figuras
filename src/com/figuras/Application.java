package com.figuras;

import com.figuras.model.Circle;
import com.figuras.model.Rectangle;
import com.figuras.model.Square;
import com.figuras.model.Triangle;

public class Application {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5), circle2 = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 20);
        Square squares[] = new Square[5];
        Triangle triangle = new Triangle(10, 20);


        printFigure(circle1);
        printFigure(rectangle);
        for (Square square : squares) {
            ///printFigure(square);
        }
        printFigure(triangle);

    }

    public static void printFigure(Circle circle) {
        circle.draw();
        System.out.println("Radio: " + circle.getArea());
    }

    public static void printFigure(Rectangle rectangle) {
        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void printFigure(Square square) {
        square.draw();
        System.out.println("Area: " + square.getArea());
    }

    public static void printFigure(Triangle triangle) {
        triangle.draw();
        System.out.println("Area: " + triangle.getArea());
    }


}
