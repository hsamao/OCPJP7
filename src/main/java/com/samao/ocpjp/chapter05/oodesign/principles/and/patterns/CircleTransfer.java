package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class CircleTransfer implements Serializable {

    private int xPos;
    private int yPos;
    private int radius;

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
