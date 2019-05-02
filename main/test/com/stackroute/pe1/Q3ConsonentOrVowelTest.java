package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q3ConsonentOrVowelTest {
    Q3ConsonentOrVowel q3ConsonentOrVowel;

    @Before
    public void setUp() throws Exception {
        q3ConsonentOrVowel=new Q3ConsonentOrVowel();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkVov() {
        String s=q3ConsonentOrVowel.checkVov( "e");
        assertEquals("it is a vowel",s);

    }

    @Test
    public void checkCon() {
        String s= q3ConsonentOrVowel.checkCon("q");
        assertEquals("it is a Consonant",s);
    }

    @Test
    public void checkNoalp() {
        String s= q3ConsonentOrVowel.checkCon("1");
        assertEquals("it is not an alphabet",s);

    }
}