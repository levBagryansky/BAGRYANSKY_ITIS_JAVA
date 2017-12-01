package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void sumOfZerosShouldReturnZero() {
        int result = calculator.sum(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void sumOfFourAndFiveShouldBeNine() {
        int result = calculator.sum(4, 5);
        assertEquals(9, result);
    }
}
