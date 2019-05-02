package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6TypeofcharTest{

    Q6Typeofchar q6Typeofchar;

    @Before
    public void setUp() throws Exception {
        q6Typeofchar= new Q6Typeofchar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkCap() {
        String s=q6Typeofchar.checkSmall( 'A');
        assertEquals("Character is a capital letter",s);
    }

    @Test
    public void checkSmall() {
        String s=q6Typeofchar.checkSmall( 'e');
        assertEquals("Character is a small letter",s);
    }


    @Test
    public void checkDigit() {
        String s=q6Typeofchar.checkSmall( '5');
        assertEquals("Character is a digit",s);
    }

    @Test
    public void checkSym() {
        String s=q6Typeofchar.checkSmall( '!');
        assertEquals("Character is a special symbol",s);
    }
}