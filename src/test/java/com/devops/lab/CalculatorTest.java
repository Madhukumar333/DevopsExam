package com.devops.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calc.add(10, 5));
        assertEquals(-5, calc.add(-10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calc.multiply(10, 5));
        assertEquals(0, calc.multiply(10, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}
