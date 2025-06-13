package FactoryPattern.ShapeTypes;

import FactoryPattern.Shape.Shape;

public class Circle implements Shape {
    @Override
    public void diagram() {
        System.out.println("I am a Circle!");
    }
}
