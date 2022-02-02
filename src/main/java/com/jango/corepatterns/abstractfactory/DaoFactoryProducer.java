package com.jango.corepatterns.abstractfactory;

public class DaoFactoryProducer {
    public static DAOAbstractFactory produce(String factoryType) {
        DAOAbstractFactory df = null;
        if (factoryType.equals("xml")) {
            df = new XMLDaoFactory();
        } else if (factoryType.equals("db")) {
            df = new DBDaoFactory();
        }
        return df;
    }
}
