package com.jango.corepatterns.abstractfactory;

public abstract class DAOAbstractFactory {

    public abstract Dao createDao(String type);
}
