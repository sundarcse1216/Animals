package com.stl.fish;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Shark extends Fish implements Behaviour {

    @Override
    public void color() {
        System.out.println("I'm large and grey");
    }

    @Override
    public void identity() {
        System.out.println("I will eat other fish");
    }
}
