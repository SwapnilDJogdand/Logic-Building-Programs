/*
 Write a program which accept string from user and copy small characters of that string into another string.
           Input : Marvellous multi OS
           Output : arvellous multi
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrCpySmall(String Str, String StrCpy1)
    {
        char Ch = '\0';
        String StrSmall = "";

        for(int i = 0; i < Str.length(); i++)
        {
            Ch = Str.charAt(i);
            if(Ch >= 'a' && Ch <= 'z' || Ch == ' ')
            {
                StrSmall += Ch;
            }
        }
        StrCpy1 = StrSmall;
        System.out.println(StrCpy1);
    }
}

public class program125 {
    public static void main(String[] args) {
        String SName = null, SName1 = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpySmall(SName,SName1);
    }
}


