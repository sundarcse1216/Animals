package com.stl.animal;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Rooster extends Animal implements Sound {
    private Chicken chicken;

    public Rooster(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public void walk() {
        this.chicken.walk();
    }
}
