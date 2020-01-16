package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    private MyClass myClass = new MyClass();

    @Test
    void foo1() {
        assertEquals(myClass.foo1(), 1);
    }

    @Test
    void foo2() {
        assertEquals(myClass.foo2(), 2);
    }

    @Test
    void foo3() {
        assertEquals(myClass.foo3(), 3);
    }

    @Test
    void foo4() {
        assertEquals(myClass.foo4(), 4);
    }
}