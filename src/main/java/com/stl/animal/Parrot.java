package com.stl.animal;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Parrot extends Bird implements Sound {

    Sound sound;

    public Parrot(Sound sound) {
        this.sound = sound;
    }

    public void sing() {
        this.sound.sing();
    }

}
