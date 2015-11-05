package com.samao.ocpjp.chapter07.processing.string;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/4/15.
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

    public void area(){
        Double circleArea = Math.PI * radius * radius;

        System.out.println("Circle area using default formatting with println: " + circleArea);
        System.out.printf("Circle area using format specifier with printf: %.2f %n", circleArea);
    }
}
