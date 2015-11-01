package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class CircleFacotryDesignPattern implements ShapeFactoryDesignPattern {

    Point center;
    int radius;

    public void draw() {

        System.out.println("draw circle");
    }

    public void fillColor() {

        System.out.println("fill color");
    }

    public CircleFacotryDesignPattern() {
    }

    public CircleFacotryDesignPattern(int xPos, int yPos, int radius) {
        center = new Point(xPos, yPos);
        this.radius = radius;
    }


}
