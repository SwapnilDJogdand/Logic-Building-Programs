/*
Write a program which accept string from user and copy that characters of that string into another string by converting all Capital case.
characters into capital case.
        Input : Marvellous Python 2
        Output : MARVELLOUS PYTHON 2
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString {
    public void StrCpyCapX(String Str1, String StrCpy) {
        String StrCap = "";
        char Ch = '\0';
        int iAscii = 0;

        for (int i = 0; i < Str1.length(); i++) {
            Ch = Str1.charAt(i);
            if (Ch >= 'a' && Ch <= 'z') {
                iAscii = Ch;
                iAscii = Ch - 32;
                Ch = (char) iAscii;
            }
            StrCap = StrCap + Ch;
        }
        StrCpy = StrCap;
        System.out.println(StrCpy);
        StrCap = "";
    }
}

public class program129 {
    public static void main(String[] args) {
        String SName1 = null, SNameCpy = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        SName1 = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpyCapX(SName1, SNameCpy);
    }
}
