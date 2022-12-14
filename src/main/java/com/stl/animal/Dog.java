package com.stl.animal;

import com.stl.Counter;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Dog extends Animal implements Sound {
    @Override
    public void sing() {
        Counter.increaseSingByOne();
        System.out.println("Woof, woof");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
