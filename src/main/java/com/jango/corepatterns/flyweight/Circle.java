package com.jango.corepatterns.flyweight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {
    private String label;

    public Circle() {

        this.label = "circle";
    }

    @Override
    public void draw(int radius, String lineColor, String fillColor) {
        System.out.println("Drawing a "+label+" with Radius "+radius
                +" With fill color "+fillColor+" line color "+lineColor);
    }
}
