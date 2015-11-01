package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class DisplayFriendlyFactory implements ShapeAbstractFactory {

    public ShapeAbstractFactoryDesignPattern getShape(String sourceType) {

        if (sourceType.equalsIgnoreCase("Circle")) {
            return new DisplayFriendlyCircle(10, 20, 30);

        } else if (sourceType.equalsIgnoreCase("Rectangle")) {
            return new DisplayFriendlyRectangle(10, 20);

        }
        return null;
    }


}
