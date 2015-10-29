package com.samao.ocpjp.chapter03.class_design.listing_3_1;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class Point3D extends Point{

    private int zPos;

    public Point3D() {
    }

    public Point3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }

    @Override
    public String toString() {

        return "Point3D{" +
                "xPos=" + super.getxPos()+
                ", yPos=" + super.getyPos()+
                " zPos=" + zPos +
                '}';
    }
}
