package com.jango.corepatterns.factory;

public class Test {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore();
        ps.orderPizza("chicken");
    }
}
