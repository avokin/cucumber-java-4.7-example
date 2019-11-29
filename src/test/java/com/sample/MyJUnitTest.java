package com.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyJUnitTest {
    @Test
    public void passingTest() {
        assertEquals(30, 5 * 6);
    }

    @Test
    public void failingTest() {
        fail();
    }
}