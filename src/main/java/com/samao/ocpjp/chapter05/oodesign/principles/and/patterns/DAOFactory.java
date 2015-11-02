package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class DAOFactory {

    public static CircleDAO getCircleDAO (String sourceType){
        if (sourceType.equalsIgnoreCase("RDBMS")) {
            return new RDBMSDAO();
        }
        return null;
    }
}
