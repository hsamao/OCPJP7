package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class DisplayFriendlyCircle implements DisplayFriendlyShape {

    Point center;
    int radius;

    public DisplayFriendlyCircle() {
    }

    public DisplayFriendlyCircle(int xPos, int yPos, int radius) {
        center = new Point(xPos, yPos);
        this.radius = radius;
        System.out.println("Display Friendly Circle constructor");
    }

    public void draw() {
        System.out.println("Display Friendly Circle draw()");
    }
}
