package com.jango.corepatterns.abstractfactory;

public class DBEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Employer to DB");
    }
}
