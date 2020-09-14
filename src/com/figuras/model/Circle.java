package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public double getArea(){
        return radio;
    }

    public void draw(){
        System.out.println("Circulo");
    }

}
