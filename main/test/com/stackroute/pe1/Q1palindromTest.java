package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1palindromTest {
    Q1palindrom q1palindrom;

    @Before
    public void setUp() throws Exception {
        q1palindrom= new Q1palindrom();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palless() {
       String s= q1palindrom.palless(3223);
       assertEquals(" is a palindrome and the sum of even numbers is lesser than 25",s);
    }

    @Test
    public void palgre() {
        String s=q1palindrom.palgre(888888);
        assertEquals("is a palindrome and the sum of even numbers is greater than 25",s);
    }

    @Test
    public void palno() {
    String s=q1palindrom.palno(5679);
    assertEquals(" is not a palindrome",s);
    }

}