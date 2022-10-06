package com.stl.fish;

import com.stl.Counter;
import com.stl.animal.Animal;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Fish extends Animal {

    public void swim() {
        Counter.increaseSwimByOne();
        System.out.println("I can Swim");
    }

    private void walk() {

    }
}
