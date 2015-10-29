package com.samao.ocpjp.chapter03.class_design.listing_3_1;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class Point {

    private int xPos, yPos;

    public Point() {
    }

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setPoint(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public boolean equals(Point point) {
        if (point == null) {
            return false;
        } else if ((point.getxPos() == xPos) && (point.getyPos() == yPos)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
