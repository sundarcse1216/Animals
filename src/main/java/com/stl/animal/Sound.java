package com.stl.animal;

import com.stl.fish.Fish;

/**
 * @author sundar
 * @since 06-10-2022
 */
public interface Sound {
    void sing();

    /**
     * @author sundar
     * @since 06-10-2022
     */
    class Dolphin extends Animal {
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
}
