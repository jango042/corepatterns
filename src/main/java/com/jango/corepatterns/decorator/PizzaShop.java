package com.jango.corepatterns.decorator;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new CheesPizzaDecorator( new PlainPizza());
        pizza.bake();
    }
}
