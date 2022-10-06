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
public class DogTest {

    @InjectMocks
    Dog dog;

    @Test
    public void sing() {
        dog.sing();
    }

    @Test
    public void walk() {
        dog.walk();
    }

}
