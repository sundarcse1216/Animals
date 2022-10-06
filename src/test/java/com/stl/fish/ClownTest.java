package com.stl.fish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author sundar
 * @since 06-10-2022
 */
@ExtendWith(MockitoExtension.class)
public class ClownTest {

    @InjectMocks
    Clown clown;

    @Test
    public void color() {
        clown.color();
    }

    @Test
    public void identity() {
        clown.identity();
    }
}
