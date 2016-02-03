package com.govorov.dp.abstractfactory;

import com.govorov.dp.abstractfactory.color.Color;
import com.govorov.dp.abstractfactory.shape.Shape;

/**
 * @author Govorov Andrey
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
