package com.jango.corepatterns.decorator;

public class VeggiePizzaDecorator extends PizaDecorator {
    VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake() {
        super.bake();
        System.out.println("Adding Veggie Toppings");
    }
}
