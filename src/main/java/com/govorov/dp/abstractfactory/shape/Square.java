package com.govorov.dp.abstractfactory.shape;

/**
 * @author Govorov Andrey
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
