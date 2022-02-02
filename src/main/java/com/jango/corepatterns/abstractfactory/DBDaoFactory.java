package com.jango.corepatterns.abstractfactory;

public class DBDaoFactory extends DAOAbstractFactory {
    @Override
    public Dao createDao(String type) {
        Dao d = null;
        if (type.equals("dept")) {
            d = new DBDeptDao();
        } else if(type.equals("emp")) {
            d = new DBEmpDao();
        }
        return d;
    }
}
