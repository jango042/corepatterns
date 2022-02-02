package com.jango.corepatterns.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DAOAbstractFactory daf = DaoFactoryProducer.produce("db");
        Dao dao = daf.createDao("dept");
        dao.save();
    }
}
