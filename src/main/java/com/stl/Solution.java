package com.stl;

import com.stl.animal.*;
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

        System.out.println("\nRooster");
        Rooster rooster = new Rooster(chicken);
        rooster.sing();
        rooster.walk();
//        rooster.fly();

        System.out.println("\nDog");
        Dog dog = new Dog();
        dog.sing();
        dog.walk();

        System.out.println("\nCat");
        Cat cat = new Cat();
        cat.sing();
        cat.walk();

        System.out.println("\ndogParrot");
        Parrot dogParrot = new Parrot(dog);
        dogParrot.sing();
        dogParrot.walk();
        dogParrot.fly();

        System.out.println("\ncatParrot");
        Parrot catParrot = new Parrot(cat);
        catParrot.sing();
        catParrot.walk();
        catParrot.fly();

        System.out.println("\nroosterParrot");
        Parrot roosterParrot = new Parrot(rooster);
        roosterParrot.sing();
        roosterParrot.walk();
        roosterParrot.fly();

        System.out.println("\nduckParrot");
        Parrot duckParrot = new Parrot(duck);
        duckParrot.sing();
        duckParrot.walk();
        duckParrot.fly();


    }

}
