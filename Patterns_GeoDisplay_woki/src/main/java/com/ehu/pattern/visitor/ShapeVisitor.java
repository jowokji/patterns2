package com.ehu.pattern.visitor;

import com.ehu.pattern.entity.impl.Rectangle;
import com.ehu.pattern.entity.impl.Triangle;

public interface ShapeVisitor {
    void visit(Triangle circle);
    void visit(Rectangle rectangle);
}