package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorPathTest {

    @Test
    void testOnlyOdd() {
        Calculator cal = new Calculator();
        assertEquals(0, cal.sumEvenNumbers(1));
    }

    @Test
    void testMixed() {
        Calculator cal = new Calculator();
        assertEquals(6, cal.sumEvenNumbers(4));
    }

    @Test
    void testZero() {
        Calculator cal = new Calculator();
        assertEquals(0, cal.sumEvenNumbers(0));
    }
}