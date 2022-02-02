package com.jango.corepatterns.flyweight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape {
    private String label;

    public Rectangle() {
        label = "rectangle";
    }

    @Override
    public void draw(int breath, int length, String fillStyle) {
        System.out.println("Drawing a "+label+" with Length "+length
                +" With Breath "+breath+" With fill color style" +fillStyle);
    }
}
