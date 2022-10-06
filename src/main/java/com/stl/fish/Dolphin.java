package com.stl.fish;

import com.stl.animal.Animal;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Dolphin extends Animal {
    private Fish fish;

    public Dolphin(Fish fish) {
        this.fish = fish;
    }

    public void swim() {
        this.fish.swim();
    }

    @Override
    public void walk() {
        super.walk();
    }

}
