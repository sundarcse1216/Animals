package com.stl.fish;

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
public class DolphinTest {

    @InjectMocks
    Dolphin dolphin;

    @Mock
    Fish fish;

    @Test
    public void swim() {
        dolphin.swim();
    }

    @Test
    public void walk() {
        dolphin.walk();
    }
}
