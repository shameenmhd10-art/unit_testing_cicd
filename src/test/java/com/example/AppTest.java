package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {
        int result = App.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAddNegative() {
        int result = App.add(-1, -2);
        assertEquals(-3, result);
    }
}
