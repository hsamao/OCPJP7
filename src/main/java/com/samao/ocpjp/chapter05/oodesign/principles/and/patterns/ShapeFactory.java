package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class ShapeFactory {

    public static ShapeFactoryDesignPattern getShape(String sourceType) {
        if (sourceType.equalsIgnoreCase("Circle")) {
            return new CircleFacotryDesignPattern(10, 20, 30);
        } else if (sourceType.equalsIgnoreCase("Rectangle")) {
            return new RectangleFactoryDesignPattern(10, 20);
        }
        return null;
    }

}