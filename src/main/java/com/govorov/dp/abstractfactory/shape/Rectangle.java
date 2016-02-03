package com.govorov.dp.abstractfactory.shape;

/**
 * @author Govorov Andrey
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
