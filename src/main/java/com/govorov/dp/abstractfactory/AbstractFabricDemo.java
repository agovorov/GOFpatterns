package com.govorov.dp.abstractfactory;

import com.govorov.dp.abstractfactory.color.Color;
import com.govorov.dp.abstractfactory.shape.Shape;

/**
 * Abstract fabric demo
 *
 * @author Govorov Andrey
 * @url http://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 */
public class AbstractFabricDemo {

    public static void main(String[] args) {
        // Shape
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        Shape shapeRect = shapeFactory.getShape("RECTANGLE");
        shapeRect.draw();

        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();

        // Color
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color colorRed = colorFactory.getColor("RED");
        colorRed.fill();

        Color colorGreen = colorFactory.getColor("GREEN");
        colorGreen.fill();

        Color colorBlue = colorFactory.getColor("BLUE");
        colorBlue.fill();
    }
}
