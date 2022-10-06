package com.stl.animal;

import com.stl.Counter;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Animal {

    void walk() {
        Counter.increaseWalkByOne();
        System.out.println("I am walking");
    }
}
