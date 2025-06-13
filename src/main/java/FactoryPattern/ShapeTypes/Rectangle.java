package FactoryPattern.ShapeTypes;

import FactoryPattern.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void diagram() {
        System.out.println("I am a Rectangle");
    }
}
