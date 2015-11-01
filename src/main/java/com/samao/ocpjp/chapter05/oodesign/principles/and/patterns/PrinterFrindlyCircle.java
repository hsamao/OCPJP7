package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class PrinterFrindlyCircle implements PrinterFriendlyShape {

    Point center;
    int raduis;

    public PrinterFrindlyCircle() {
    }

    public PrinterFrindlyCircle(int xPos, int yPos, int raduis) {
        center = new Point(xPos, yPos);
        this.raduis = raduis;

        System.out.println("Printer Friendly Circle constructor");
    }

    public void draw() {
        System.out.println("Printer Friendly Circle draw()");
    }
}
