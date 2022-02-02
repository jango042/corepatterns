package com.jango.corepatterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;
    private DateUtil(){
    }

    public static DateUtil getInstance() {
        //Handle multithreading
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance ;
    }

    //Handle serialization
    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
