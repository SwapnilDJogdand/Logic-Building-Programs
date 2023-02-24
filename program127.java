/*
Write a program which accept string from user and copy that characters of that string into another string in reverse order.
        Input : Marvellous Python
        Output : nohtyP suollevraM
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrCpyRev(String Str1, String StrCpy)
    {
        String StrRev = "";
        char Ch = '\0';

        for(int i = 0; i < Str1.length(); i++)
        {
            Ch = Str1.charAt(i);
            StrRev = Ch + StrRev;
        }
        StrCpy = StrRev;
        System.out.println(StrCpy);
    }
}

public class program127 {
    public static void main(String[] args) {
        String SName1 = null, SNameCpy = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        SName1 = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpyRev(SName1,SNameCpy);
    }
}




