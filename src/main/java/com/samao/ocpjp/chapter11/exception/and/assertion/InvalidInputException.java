package com.samao.ocpjp.chapter11.exception.and.assertion;

/**
 * Created by hsamao on 11/9/15.
 */
public class InvalidInputException extends RuntimeException {

    public InvalidInputException (){
        super();
    }

    public InvalidInputException(String str){
        super(str);
    }

    public InvalidInputException (Throwable originalException){
        super(originalException);
    }

    public InvalidInputException(String str, Throwable originalException){
        super(str, originalException);
    }
}
