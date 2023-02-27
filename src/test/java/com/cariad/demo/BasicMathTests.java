package com.cariad.demo;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicMathTests {
    BasicMath uut = new BasicMath();

    @Test
    public void test() {
        assertEquals(42, uut.add(40,2));
    }
}
