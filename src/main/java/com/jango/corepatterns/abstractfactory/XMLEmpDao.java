package com.jango.corepatterns.abstractfactory;

public class XMLEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Employer to XML");
    }
}
