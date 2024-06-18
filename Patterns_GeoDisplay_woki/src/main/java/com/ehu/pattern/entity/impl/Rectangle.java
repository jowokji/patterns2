package com.ehu.pattern.entity.impl;

import com.ehu.pattern.device.Device;
import com.ehu.pattern.entity.Shape;
import com.ehu.pattern.visitor.ShapeVisitor;

public class Rectangle extends Shape {
    private double length;
    private double width;

    private double perimeter;
    private double area;

    public Rectangle(Device device, double length, double width) {
        super(device);
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }

    @Override
    public void draw() {
        device.render("Rectangle");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}