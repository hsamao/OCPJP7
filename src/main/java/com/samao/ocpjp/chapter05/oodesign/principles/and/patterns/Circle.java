package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/31/15.
 */

//@Component
public class Circle extends Shape implements Rollable {

    private int xPos, yPos, radius;

    public Circle() {
    }

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public void roll(float degree) {

        System.out.println("The circle shape has been rolled " + degree + " degree");

    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", radius=" + radius +
                '}';
    }
}
