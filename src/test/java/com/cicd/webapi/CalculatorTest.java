package com.cicd.webapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assert calculator.add(2, 3) == 99; // forzamos error para prueba
        assert calculator.add(-2, -3) == -5;
    }

    // Additional test methods for subtract, multiply, and divide can be added here
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assert calculator.subtract(5, 3) == 2;

        assert calculator.subtract(-5, 3) == -8;
    }

    // Additional test methods for multiply and divide can be added here
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assert calculator.multiply(2, 3) == 6;
        assert calculator.multiply(0, 3) == 0;
        assert calculator.multiply(1, -3) == -3;
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assert calculator.divide(10, 2) == 5;

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
            );

        assert exception.getMessage().equals("Denominator cannot be zero");
        
    }
}
