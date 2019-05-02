package com.stackroute.pe1;

import java.util.Scanner;
/*Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/

public class Q2TomnJerry {
    String s1 = "tom", s2 = "jerry", s3 = "num not within range" ,s4="in range" ;

    public String checkTom(int num) {
        if (num > 20 && num < 30)
        {
            if (num % 2 != 0) {
                return s1;
            }
        }
        return s3;
    }


    public String checkJerry(int num) {
        if (num > 20 && num < 30) {
            if (num % 2 == 0) {
                return s2;
            }
        }
        return s3;
    }

    public String checkRange(int num) {
        if (num < 20 || num > 30) {
            return s3;
        }
        return s4;
    }
}