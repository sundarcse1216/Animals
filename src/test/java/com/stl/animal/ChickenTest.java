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
public class ChickenTest {

    @InjectMocks
    Chicken chicken;

    @Test
    public void sing() {
        chicken.sing();
    }

    @Test
    public void walk() {
        chicken.walk();
    }
}
