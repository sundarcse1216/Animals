package com.stl.animal;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Chicken extends Animal implements Sound {
    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
