package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public interface CircleDAO {

    void insertCircle (CircleTransfer circleTransfer);
    CircleTransfer findCircle (int id);
    void deleteCircle (int id);
}
