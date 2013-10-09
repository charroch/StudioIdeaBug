package com.novoda.test;

import static org.junit.Assert.*;

public class MyClassTest {

    @org.junit.Test
    public void testTenIsTen() {
        MyClass cut = new MyClass();
        assertTrue(cut.ten() == 9);
    }
}
