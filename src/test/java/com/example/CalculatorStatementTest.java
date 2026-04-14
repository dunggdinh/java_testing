package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStatementTest {
    
    @Test
    void testStatementCoverage() {
        Calculator cal = new Calculator();
        int result = cal.sumEvenNumbers(4);

        assertEquals(6, result);
    }
}
