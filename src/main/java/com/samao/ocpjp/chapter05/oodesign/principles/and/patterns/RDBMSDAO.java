package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class RDBMSDAO implements CircleDAO {


    public void insertCircle(CircleTransfer circleTransfer) {
        System.out.println("Insert Circle Implementation");
    }

    public CircleTransfer findCircle(int id) {
        System.out.println("find circle");
        return null;
    }

    public void deleteCircle(int id) {
        System.out.println("delete circle");
    }
}
