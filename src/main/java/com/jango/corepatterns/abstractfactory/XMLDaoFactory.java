package com.jango.corepatterns.abstractfactory;

public class XMLDaoFactory extends DAOAbstractFactory {
    @Override
    public Dao createDao(String type) {
        Dao d = null;
        if (type.equals("dept")) {
            d = new XMLDeptDao();
        } else if(type.equals("emp")) {
            d = new XMLEmpDao();
        }
        return d;
    }
}
