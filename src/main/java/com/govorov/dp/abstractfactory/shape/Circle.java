package com.govorov.dp.abstractfactory.shape;

/**
 * @author Govorov Andrey
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
