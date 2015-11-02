package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import com.samao.ocpjp.chapter03.class_design.Point;
import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class CircleDAODesignPattern {

    private Point center;
    private int radius;

    public CircleDAODesignPattern() {
    }

    public CircleDAODesignPattern(int xPos, int yPos, int radius) {
        center = new Point(xPos, yPos);
        this.radius = radius;
    }

    public CircleTransfer getCircleTransferObject () {
        CircleTransfer circleTransfer = new CircleTransfer();
        circleTransfer.setxPos(center.getxPos());
        circleTransfer.setyPos(center.getyPos());
        circleTransfer.setRadius(radius);

        return circleTransfer;
    }

    @Override
    public String toString() {
        return "CircleDAODesignPattern{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
