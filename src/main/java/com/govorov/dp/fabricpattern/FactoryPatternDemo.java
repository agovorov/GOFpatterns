package com.govorov.dp.fabricpattern;

/**
 * Factory pattern demo
 *
 * @author Govorov Andrey
 * @url http://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Circle
        Shape shapeCircle = factory.getShape("circle");
        shapeCircle.draw();

        // Rect
        Shape shapeRect = factory.getShape("rectangle");
        shapeRect.draw();

        // Square
        Shape shapeSquare = factory.getShape("square");
        shapeSquare.draw();
    }
}
