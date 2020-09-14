package com.figuras.model;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        return side;
    }

    public void draw() {
        System.out.println("Cuadrado");
    }
}
