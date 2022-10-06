package com.stl.animal;

import com.stl.fish.Fish;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Duck extends Bird implements Sound {

    private Fish fish;

    public Duck(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        this.fish.swim();
    }

}
