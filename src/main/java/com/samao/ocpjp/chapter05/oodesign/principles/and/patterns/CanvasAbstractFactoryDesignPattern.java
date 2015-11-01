package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class CanvasAbstractFactoryDesignPattern {

    private ArrayList<ShapeAbstractFactoryDesignPattern> shapeList = new ArrayList<ShapeAbstractFactoryDesignPattern>();
    public void addNewShape(String shapeType, String factoryType){
        ShapeAbstractFactory factory = null;
        if (factoryType.equals("PrinterFriendly")) {
            factory = new PrinterFriendlyFactory();

        } else if (factoryType.equals("DisplayFriendly")) {
            factory = new DisplayFriendlyFactory();
        }
        ShapeAbstractFactoryDesignPattern shape = factory.getShape(shapeType);
        shapeList.add(shape);
    }
    public void redraw(){
        Iterator<ShapeAbstractFactoryDesignPattern> itr = shapeList.iterator();
        while(itr.hasNext()){
            ShapeAbstractFactoryDesignPattern shape = itr.next();
            shape.draw();

        }
    }

}
