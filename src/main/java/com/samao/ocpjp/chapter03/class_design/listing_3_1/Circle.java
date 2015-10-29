package com.samao.ocpjp.chapter03.class_design.listing_3_1;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class Circle {

    private int xPos, yPos , radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public Circle() {
        this.xPos = 20;
        this.yPos = 20;
        this.radius = 10;
    }

    public void setCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
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
