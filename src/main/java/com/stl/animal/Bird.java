package com.stl.animal;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Bird extends Animal {

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I'm Singing");
    }

    @Override
    public void walk() {
        super.walk();
    }

}
