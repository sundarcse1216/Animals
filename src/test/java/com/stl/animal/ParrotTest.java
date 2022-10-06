package com.stl.animal;

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
public class ParrotTest {
    @InjectMocks
    Parrot parrot;

    @Mock
    Sound sound;

    @Test
    public void walk() {
        parrot.walk();
    }

    @Test
    public void fly() {
        parrot.fly();
    }

    @Test
    public void sing() {
        parrot.sing();
    }
}
