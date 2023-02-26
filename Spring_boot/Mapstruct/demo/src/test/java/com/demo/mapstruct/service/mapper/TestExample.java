package com.demo.mapstruct.service.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TestExample {

    private int a = 0;
    private int b = 0;

    @BeforeEach
    public void abc() {
        a = 10;
        b = 4;
    }

    @Test
    @DisplayName("Test 1")
    public void testStringExample() {
        String x = null;
        assertEquals("ABC", "ABC");
//        assertNotNull(x);
        assertNull(x);
    }

    @Test
    @DisplayName("Test 2")
    @Timeout(value = 1, unit = TimeUnit.MICROSECONDS)
    public void testSum() {
        assertEquals(sum(a, b), 14);
    }

    @Test
    @DisplayName("Test 2")
    public void testSubtract() {
        assertEquals(subtract(a, b), 6);
    }

    int sum(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}
