package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class CircleEnhancedDesignPattern extends Observable {

    private Point center;
    private int radius;

    public CircleEnhancedDesignPattern() {
    }

    public CircleEnhancedDesignPattern(int xPos, int yPos, int radius) {
        center = new Point(xPos, yPos);
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
        setChanged();
        notifyObservers();
    }

    public void setRadius(int radius) {
        this.radius = radius;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "CircleEnhancedDesignPattern{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
