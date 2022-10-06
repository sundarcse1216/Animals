package com.stl.animal;

import com.stl.Counter;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Bird extends Animal {

    public void fly() {
        Counter.increaseFlyByOne();
        System.out.println("I am flying");
    }

    public void sing() {
        Counter.increaseSingByOne();
        System.out.println("I'm Singing");
    }

    @Override
    public void walk() {
        super.walk();
    }

}
