package com.ehu.pattern.visitor.impl;

import com.ehu.pattern.entity.impl.Rectangle;
import com.ehu.pattern.entity.impl.Triangle;
import com.ehu.pattern.visitor.ShapeVisitor;

public class PerimeterShapeVisitor implements ShapeVisitor {
    @Override
    public void visit(Triangle triangle) {
        // Вычисление периметра круга
        double result = (triangle.getSides()[0] + triangle.getSides()[1] + triangle.getSides()[2]);
        System.out.println("Perimeter =" + result);

    }

    @Override
    public void visit(Rectangle rectangle) {
        double result=  2 * (rectangle.getLength() + rectangle.getWidth());
        System.out.println("Perimeter =" + result);
    }

}