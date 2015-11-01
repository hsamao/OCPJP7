package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class CanvasFactoryDesignPattern {

    private ArrayList<ShapeFactoryDesignPattern> shapeList = new ArrayList<ShapeFactoryDesignPattern>();

    public void addNewShape(String shapeType) {
        ShapeFactoryDesignPattern shapeFactoryDesignPattern = ShapeFactory.getShape(shapeType);
        shapeList.add(shapeFactoryDesignPattern);
    }

    public void redraw() {
        Iterator<ShapeFactoryDesignPattern> iterator = shapeList.iterator();
        while (iterator.hasNext()) {
            ShapeFactoryDesignPattern shapeFactoryDesignPattern = iterator.next();
            shapeFactoryDesignPattern.draw();
        }
    }
}
