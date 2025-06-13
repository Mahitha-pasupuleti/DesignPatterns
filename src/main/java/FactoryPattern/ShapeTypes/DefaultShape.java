package FactoryPattern.ShapeTypes;

import FactoryPattern.Shape.Shape;

public class DefaultShape implements Shape {
    @Override
    public void diagram() {
        System.out.println("This is a default shape not yet defined!");
    }
}
