package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/31/15.
 */

@Component
public class Rectangle extends Shape implements Rotatable {


    private int length, height;

    public Rectangle() {
    }

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void rotate(float degree) {

        System.out.println("The rectangle shape has been rotated " + degree + "degree");

    }

    @Override
    double area() {
        return length * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
