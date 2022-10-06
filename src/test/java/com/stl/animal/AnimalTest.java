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
public class AnimalTest {

    @InjectMocks
    Animal animal;

    @Test
    public void testWalk() {
        animal.walk();
    }
}
