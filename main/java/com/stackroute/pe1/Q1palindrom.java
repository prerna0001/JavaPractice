package com.stackroute.pe1;

import java.util.Scanner;
/*Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions*/

public class Q1palindrom
{
    String s1= " is a palindrome and the sum of even numbers is lesser than 25",s2="is a palindrome and the sum of even numbers is greater than 25",s3=" is not a palindrome";
    public String palless(int number)
    {
        int revnumber = 0;
        int remainder;
        int sum = 0;
        int temp=0;


        temp = number;

        while(temp != 0)
        {

            remainder = temp% 10;  // Find the last digit
            revnumber = ( revnumber * 10 ) + remainder; // To reverse the number
            temp = temp / 10;

            if( remainder % 2 == 0)
            {
                sum = sum + remainder;  // Add sum if the digit is even
            }
        }


        if( number == revnumber)
        {
            if(sum < 25)
            {

                return s1;
            }
            else
                return s2;
        }

        else
            return s3;


    }

    public String palgre(int number)
    {
        int revnumber = 0;
        int remainder;
        int sum = 0;
        int temp=0;


        temp = number;

        while(temp != 0)
        {

            remainder = temp% 10;  // Find the last digit
            revnumber = ( revnumber * 10 ) + remainder; // To reverse the number
            temp = temp / 10;

            if( remainder % 2 == 0)
            {
                sum = sum + remainder;  // Add sum if the digit is even
            }
        }


        if( number == revnumber)
        {
            if(sum < 25)
            {

                return s1;
            }
            else
                return s2;
        }

        else
            return s3;



    }

    public String palno(int number)
    {
        int revnumber = 0;
        int remainder;
        int sum = 0;
        int temp=0;


        temp = number;

        while(temp != 0)
        {

            remainder = temp% 10;  // Find the last digit
            revnumber = ( revnumber * 10 ) + remainder; // To reverse the number
            temp = temp / 10;

            if( remainder % 2 == 0)
            {
                sum = sum + remainder;  // Add sum if the digit is even
            }
        }


        if( number == revnumber)
        {
            if(sum < 25)
            {

                return s1;
            }
            else
                return s2;
        }

        else
            return s3;



    }

}