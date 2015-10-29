package com.samao.ocpjp.chapter03.class_design.listing_3_1;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class DownCast {

    private Object object;
    private String string;

    public Object getObject (Integer integer) {
        return object = integer;
    }

    public String getString (Object object) {
        return (String) object;
    }

}
