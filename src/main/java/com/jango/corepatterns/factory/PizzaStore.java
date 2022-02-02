package com.jango.corepatterns.factory;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza p = PizzaFacrory.createPizza(type);
        p.bake();
        p.prepare();
        p.cut();
        return p;
    }
}
