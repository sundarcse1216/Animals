package com.stl.animal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author sundar
 * @since 06-10-2022
 */
@ExtendWith(MockitoExtension.class)
public class BirdTest {

    @InjectMocks
    Bird bird;

    @Test
    public void testFly() {
        bird.fly();
    }

    @Test
    public void testWalk() {
        bird.walk();
    }

    @Test
    public void testSing() {
        bird.sing();
    }
}
