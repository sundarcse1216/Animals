package com.stl.animal;

import com.stl.Counter;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Cat extends Animal implements Sound {
    @Override
    public void sing() {
        Counter.increaseSingByOne();
        System.out.println("Me ow");
    }

    @Override
    public void walk() {
        super.walk();
    }
}
