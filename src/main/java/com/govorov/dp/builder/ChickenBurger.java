package com.govorov.dp.builder;

/**
 * @author Govorov Andrey
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
