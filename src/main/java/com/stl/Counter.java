package com.stl;

/**
 * @author sundar
 * @since 06-10-2022
 */
public class Counter {

    private static short fly;
    private static short walk;
    private static short sing;
    private static short swim;

    public static short getFly() {
        return fly;
    }

    public static void setFly(short fly) {
        Counter.fly = fly;
    }

    public static short getWalk() {
        return walk;
    }

    public static void setWalk(short walk) {
        Counter.walk = walk;
    }

    public static short getSing() {
        return sing;
    }

    public static void setSing(short sing) {
        Counter.sing = sing;
    }

    public static short getSwim() {
        return swim;
    }

    public static void setSwim(short swim) {
        Counter.swim = swim;
    }

    public static void increaseFlyByOne() {
        fly++;
    }

    public static void increaseWalkByOne() {
        walk++;
    }

    public static void increaseSingByOne() {
        sing++;
    }

    public static void increaseSwimByOne() {
        swim++;
    }
}
