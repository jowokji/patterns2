package com.ehu.pattern.visitor.impl;

import com.ehu.pattern.entity.impl.Rectangle;
import com.ehu.pattern.entity.impl.Triangle;
import com.ehu.pattern.visitor.ShapeVisitor;

public class AreaShapeVisitor implements ShapeVisitor {
    @Override
    public void visit(Triangle triangle) {
        double s = (triangle.getSides()[0] + triangle.getSides()[1] + triangle.getSides()[2]);
        double result = Math.sqrt(s * (s - triangle.getSides()[0]) * (s - triangle.getSides()[1]) * (s - triangle.getSides()[2]));
        System.out.println("Area =" + result);

    }
    @Override
    public void visit(Rectangle rectangle) {
        double result = rectangle.getLength() * rectangle.getWidth();
        System.out.println("Area =" + result);

    }

}