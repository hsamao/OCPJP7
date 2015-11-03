package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/3/15.
 */

@Component
public class Circle {

    private int xPos;
    private int yPos;
    private int radius;

    public Circle() {
    }

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object arg) {
       if (arg == null) return false;
        if (this == arg) return true;
        if (arg instanceof Circle) {
            Circle that = (Circle) arg;
            if ((this.xPos == that.xPos) && (this.yPos == that.yPos) && (this.radius == that.radius)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (7 * xPos) ^ (11 * yPos) ^ (53 * radius);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (xPos != circle.xPos) return false;
        if (yPos != circle.yPos) return false;
        return radius == circle.radius;

    }*/

   /* @Override
    public int hashCode() {
        int result = xPos;
        result = 31 * result + yPos;
        result = 31 * result + radius;
        return result;
    }*/
}
