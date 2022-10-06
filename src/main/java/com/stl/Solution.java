package com.stl;

import com.stl.animal.Bird;
import com.stl.animal.Chicken;
import com.stl.animal.Duck;
import com.stl.fish.Fish;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("Bird");
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("\nDuck");
        Duck duck = new Duck(new Fish());
        duck.sing();
        duck.fly();
        duck.walk();
        duck.swim();

        System.out.println("\nChicken");
        Chicken chicken = new Chicken();
        chicken.sing();
        chicken.walk();
//        chicken.fly();
    }

}
