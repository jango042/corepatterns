package com.jango.corepatterns.decorator;

public class PizaDecorator implements Pizza {
    private Pizza pizza;

    PizaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
