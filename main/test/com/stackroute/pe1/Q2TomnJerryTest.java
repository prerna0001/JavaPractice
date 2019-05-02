package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2TomnJerryTest {
    Q2TomnJerry q2TomnJerry;
    @Before
    public void setUp() throws Exception {
        q2TomnJerry =new Q2TomnJerry();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkTom() {
        String s1= q2TomnJerry.checkTom(21);
        assertEquals("tom",s1);
    }

    @Test
    public void checkJerry() {
        String s1=q2TomnJerry.checkJerry(26);
        assertEquals("jerry",s1);

    }

    @Test
    public void checkRange() {
        String s1=q2TomnJerry.checkRange(56);
        assertEquals("num not within range",s1);



    }


}