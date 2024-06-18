package com.ehu.pattern.main;

import com.ehu.pattern.device.Device;
import com.ehu.pattern.device.impl.PrinterDevice;
import com.ehu.pattern.device.impl.ScreenDevice;
import com.ehu.pattern.entity.impl.Rectangle;
import com.ehu.pattern.entity.impl.Triangle;
import com.ehu.pattern.visitor.impl.AreaShapeVisitor;
import com.ehu.pattern.visitor.impl.PerimeterShapeVisitor;

public class Main {
    public static void main(String[] args) {
        Device screen = new ScreenDevice();
        Device printer = new PrinterDevice();
        AreaShapeVisitor areaVisitor = new AreaShapeVisitor();
        PerimeterShapeVisitor perimeterVisitor = new PerimeterShapeVisitor();
        Triangle screenTriangle = new Triangle(screen,new int[]{3, 4, 5});
        Rectangle printerRectangle = new Rectangle(printer,12,12.3);
        screenTriangle.draw();
        screenTriangle.accept(areaVisitor);
        screenTriangle.accept(perimeterVisitor);
        System.out.println("--------------------------------");
        printerRectangle.draw();
        printerRectangle.accept(areaVisitor);
        printerRectangle.accept(perimeterVisitor);
    }
}