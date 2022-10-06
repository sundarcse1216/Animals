package com.stl.animal;

import com.stl.fish.Fish;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author sundar
 * @since 06-10-2022
 */
@ExtendWith(MockitoExtension.class)
public class DuckTest {

    @InjectMocks
    Duck duck;

    @Mock
    Fish fish;

    @Test
    public void sing() {
        duck.sing();
    }

    @Test
    public void walk() {
        duck.walk();
    }

    @Test
    public void swim() {
        duck.swim();
    }

    @Test
    public void fly() {
        duck.fly();
    }
}
