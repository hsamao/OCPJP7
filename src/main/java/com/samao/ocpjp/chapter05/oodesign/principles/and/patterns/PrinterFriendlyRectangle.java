package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class PrinterFriendlyRectangle implements PrinterFriendlyShape {

    int length, height;

    public PrinterFriendlyRectangle() {
    }

    public PrinterFriendlyRectangle(int length, int height) {
        this.length = length;
        this.height = height;

        System.out.println("Printer Friendly Rectangle constructor");
    }

    public void draw() {
        System.out.println("Printer Friendly Rectangle draw()");
    }
}
