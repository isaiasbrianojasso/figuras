package com.figuras.model;

public class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base;
    }

    public void draw() {
        System.out.println("Triangulo");
    }
}
