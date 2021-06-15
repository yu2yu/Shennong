package com.yy.shennong;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    private Calculate calculate;

    @BeforeEach
    public void init(){
        calculate = new Calculate();
    }

    @Test
    void add() {
        assertEquals(3,calculate.add(1,2));
        assertEquals(3,calculate.add(1,2));
    }

    @AfterEach
    void tearDown() {
        calculate = null;
    }

    @Test
    void sub() {
        assertEquals(3,calculate.sub(6,2));
        assertEquals(4,calculate.sub(8,2));
        assertEquals(4,calculate.sub(8,0));
    }

    @Test
    void mul() {
        assertEquals(2,calculate.mul(1,2));
        assertEquals(6,calculate.mul(3,2));
    }
}