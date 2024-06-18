    package com.ehu.pattern.entity.impl;

    import com.ehu.pattern.device.Device;
    import com.ehu.pattern.entity.Shape;
    import com.ehu.pattern.visitor.ShapeVisitor;

    public class Triangle extends Shape {
        private double perimeter;
        private double area;
        private int[] sides = new int[3];

        public Triangle(Device device,int[] sides) {
            super(device);
            this.sides = sides;

        }

        public int[] getSides() {
            return sides;
        }

        public double getPerimeter() {
            return perimeter;
        }

        public double getArea() {
            return area;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }
        @Override
        public void draw() {
            device.render("Circle");
        }
        public void accept(ShapeVisitor visitor) {
            visitor.visit(this);
        }
    }
