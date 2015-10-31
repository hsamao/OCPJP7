package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 10/31/15.
 */
public class Point {

    int xPos, yPos;

    public Point() {
    }

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
