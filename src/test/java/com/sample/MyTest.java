package com.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyTest {
    @Test
    public void testNothing() {
        fail();
    }

    @Test
    public void testFail() {
        fail();
    }

    @Test
    public void testError() {
        throw new RuntimeException();
    }
}
