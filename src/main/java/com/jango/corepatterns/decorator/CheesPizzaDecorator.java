package com.jango.corepatterns.decorator;

public class CheesPizzaDecorator extends PizaDecorator {
    CheesPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding Cheese Toppings");
    }
}
