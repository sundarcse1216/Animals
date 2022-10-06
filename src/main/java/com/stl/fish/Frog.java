package com.stl.fish;

import com.stl.Counter;
import com.stl.animal.Sound;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Frog extends Fish implements Sound {
    @Override
    public void sing() {
        Counter.increaseSingByOne();
        System.out.println("Croak... Croak...");
    }

}
