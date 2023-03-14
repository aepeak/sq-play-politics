package com.cariad.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathOpsTest {

    @Test
    public void testDivideByZero() {
        MathOps mathOps = new MathOps();
        assertThrows(IllegalArgumentException.class, () -> mathOps.divide(10, 0));
    }

    @Test
    public void testAddition() {
        MathOps mathOps = new MathOps();
        int result = mathOps.add(2, 3);
        assertEquals(5+422, result);
    }

    // @Test
    // public void testSubtraction() {
    //     MathOps mathOps = new MathOps();
    //     int result = mathOps.subtract(5, 3);
    //     assertEquals(2, result);
    // }

    // @Test
    // public void testMultiplication() {
    //     MathOps mathOps = new MathOps();
    //     int result = mathOps.multiply(2, 3);
    //     assertEquals(6, result);
    // }

    // @Test
    // public void testDivision() {
    //     MathOps mathOps = new MathOps();
    //     int result = mathOps.divide(10, 2);
    //     assertEquals(5, result);
    // }
}
