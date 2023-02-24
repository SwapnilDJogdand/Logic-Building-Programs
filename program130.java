/*
 Write a program which accept string from user and copy that characters of that string into another string by converting all small case.
characters into Small case.
    Input :  Marvellous Python 2
    Output : marvellous python 2
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString {
    public void StrCpySmallX(String Str1, String StrCpy) {
        String StrSmall = "";
        char Ch = '\0';
        int iAscii = 0;

        for (int i = 0; i < Str1.length(); i++) {
            Ch = Str1.charAt(i);
            if (Ch >= 'A' && Ch <= 'Z') {
                iAscii = Ch;
                iAscii = Ch + 32;
                Ch = (char) iAscii;
            }
            StrSmall = StrSmall + Ch;
        }
        System.out.println(StrSmall);
        StrSmall = "";
    }
}

public class program130 {
    public static void main(String[] args) {
        String SName1 = null, SNameCpy = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        SName1 = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpySmallX(SName1, SNameCpy);
    }
}
