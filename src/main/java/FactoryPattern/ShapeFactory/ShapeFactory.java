package FactoryPattern.ShapeFactory;

import FactoryPattern.ShapeTypes.Circle;
import FactoryPattern.ShapeTypes.DefaultShape;
import FactoryPattern.ShapeTypes.Rectangle;
import FactoryPattern.Shape.Shape;
import FactoryPattern.ShapeTypes.Square;

public class ShapeFactory {

    public Shape getShape(String value) {
        if ( value.equals("Circle") ) {
            return new Circle();
        } else if ( value.equals("Rectangle") ) {
            return new Rectangle();
        } else if ( value.equals("Square") ) {
            return new Square();
        } else {
            return new DefaultShape();
        }
    }

}
