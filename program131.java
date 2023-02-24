/*
 Write a program which accept string from user and copy that characters of that string into another string by toggling the case.c
       Input : Marvellous Python 2
       Output : mARVELLOUS pYTHON 2
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString {
    public void StrCpyToggleX(String Str1, String StrCpy) {
        String StrSmall = "", StrCap = "", SToggle = "";
        char Ch = '\0', Ch1 = '\0';
        int iAscii = 0;

        for (int i = 0; i < Str1.length(); i++) {
            Ch = Str1.charAt(i);
            if (Ch >= 'A' && Ch <= 'Z') {
                iAscii = Ch;
                iAscii = Ch + 32;
                Ch = (char) iAscii;
            }
            else if(Ch >= 'a' && Ch <= 'z')
            {
                iAscii = Ch;
                iAscii = Ch - 32;
                Ch = (char) iAscii;
            }
            SToggle += Ch;
        }
        System.out.println(SToggle);
        SToggle = "";
    }
}

public class program131 {
    public static void main(String[] args) {
        String SName1 = null, SNameCpy = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        SName1 = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpyToggleX(SName1, SNameCpy);
    }
}
