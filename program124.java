/*
Write a program which accept string from user and copy capital characters of that string into another string.
       Input : Marvellous Multi OS
       Output : MMOS
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrCpyCap(String Str, String StrCpy1)
    {
        char Ch = '\0';
        String StrCap = "";

        for(int i = 0; i < Str.length(); i++)
        {
            Ch = Str.charAt(i);
            if(Ch >= 'A' && Ch <= 'Z' || Ch == ' ')
            {
                StrCap += Ch;
            }
        }
        StrCpy1 = StrCap;
        System.out.println(StrCpy1);
    }
}

public class program124 {
    public static void main(String[] args) {
        String SName = null, SName1 = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpyCap(SName,SName1);
    }
}


