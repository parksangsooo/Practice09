package com.javaex.ex04;

public class RectTriangle extends Shape {
    private double width;
    private double height;

    // 생성자
    public RectTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height)* 0.5;
    }

    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt((width*width)+(height*height));
    }
}