package com.stl.fish;

import com.stl.animal.Sound;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Frog extends Fish implements Sound {
    @Override
    public void sing() {
        System.out.println("Croak... Croak...");
    }

}
