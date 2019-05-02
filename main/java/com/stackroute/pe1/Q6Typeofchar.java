package com.stackroute.pe1;

/*Write a program that takes a character from the user as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a special symbol and display
appropriately.*/

public class Q6Typeofchar
{
    String s1= "Character is a capital letter", s2="Character is a small letter", s3="Character is a digit",s4="Character is a special symbol";

    public String checkCap(char ch)
    {
        if (ch>=65 && ch<=90)
            return s1;

        else if (ch>=97 && ch<=122)
            return s2;

        else if (ch>=48 && ch<=57)
            return s3;

        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            return s4;
        return null;

    }

    public String checkSmall(char ch)
    {
        if (ch>=65 && ch<=90)
            return s1;

        else if (ch>=97 && ch<=122)
            return s2;

        else if (ch>=48 && ch<=57)
            return s3;

        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            return s4;
        return null;

    }

    public String checkDigit(char ch)
    {

        if (ch>=65 && ch<=90)
            return s1;

        else if (ch>=97 && ch<=122)
            return s2;

        else if (ch>=48 && ch<=57)
            return s3;

        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            return s4;
        return null;

    }

    public String checkSym(char ch)
    {

        if (ch>=65 && ch<=90)
            return s1;

        else if (ch>=97 && ch<=122)
            return s2;

        else if (ch>=48 && ch<=57)
            return s3;

        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            return s4;
        return null;
    }

}
