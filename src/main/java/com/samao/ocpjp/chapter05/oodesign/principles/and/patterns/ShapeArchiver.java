package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hsamao on 11/1/15.
 */

@Component
public class ShapeArchiver implements Observer{

    public void update(Observable o, Object arg) {
        System.out.println("ShapeArchiver :: updated");
    }
}
