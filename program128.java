/*
Write a program which accept string from user and copy that characters of that string into another string by removing all white spaces.
       Input : Marvel lous Pyth on
       Output : MarvellousPython
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrCpyX(String Str1, String StrCpy)
    {
        String Strws = "";
        char Ch = '\0';

        for(int i = 0; i < Str1.length(); i++,Ch++)
        {
            Ch = Str1.charAt(i);
            if(Ch != ' ')
            {
                Strws += Ch;
            }
        }
        StrCpy = Strws;
        System.out.println(StrCpy);
    }
}

public class program128 {
    public static void main(String[] args) {
        String SName1 = null, SNameCpy = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        SName1 = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpyX(SName1,SNameCpy);
    }
}






