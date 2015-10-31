package com.samao.ocpjp.chapter03.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

//@Component
public class Circle extends Shape {

    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
