package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/31/15.
 */

@Component
public class CircleCompsite {

    private Point point;
    private int radius;

    public CircleCompsite() {
    }

    public CircleCompsite(int xPos, int yPos, int radius) {
        point = new Point(xPos, yPos);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleCompsite{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }
}
