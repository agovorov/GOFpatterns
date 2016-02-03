package com.govorov.dp.abstractfactory.color;

/**
 * @author Govorov Andrey
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill red");
    }
}
