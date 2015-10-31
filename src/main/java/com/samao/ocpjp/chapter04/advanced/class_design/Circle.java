package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

//@Component
public class Circle {

    private int radius;
    private Point center;

    class Point {

        int xPos, yPos;

        public Point(int xPos, int yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "xPos=" + xPos +
                    ", yPos=" + yPos +
                    '}';
        }
    }

    public Circle() {
    }

    public Circle(int xPos, int yPos, int radius) {
        center = this.new Point(xPos, yPos);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
