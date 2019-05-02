package com.stackroute.pe1;
/*Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter*/

public class Q3ConsonentOrVowel
{
    String s1="it is a vowel", s2="it is a Consonant",s3="it is not an alphabet";
    public String checkVov(String str)
    {
        for (int i = 0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z'))
            {

                if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
                {
                    return s1;

                }
                else
                    return s2;
            }
            else
                return s3;

        }
        return null;
    }

    public String checkCon(String str)
    {
        for (int i = 0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z'))
            {

                if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
                {
                    return s1;

                }
                else
                    return s2;
            }
            else
                return s3;

        }
        return null;
    }


    public String checkNoalp(String str)
    {
        for (int i = 0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z'))
            {

                if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
                {
                    return s1;

                }
                else
                    return s2;
            }
            else
                return s3;

        }
        return null;
    }

}
