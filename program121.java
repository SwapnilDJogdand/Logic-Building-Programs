/*
Statements 29.5 : Write a program which accept string from user reverse that string in replace.c
      Input : abcd
     Output : dcba
      Input : abba
     Output : abba

*/
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrRevX(String Str)
    {
        char Ch = '\0';
        String SRev = "";

        for(int i = 0; i < Str.length(); i++)
        {
            Ch = Str.charAt(i);
            SRev = Ch + SRev;
        }
        System.out.println(SRev);
    }
}

public class program121 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrRevX(SName);
    }
}


