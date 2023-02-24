/*
 Write a program which accept string from user and copy the contents of that string into another string.(Implement strncpy() function)
       Input : Marvellous Multi OS
                10
      Output : “Marvellous
  Note : If third parameter is greater than the size of source string then
        copy whole string into destination.

*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrNCpyX(String Str, String StrCpy1, int iNumber)
    {
        char Ch = '\0';
        String StrNew = "";

        for(int i = 0; i < iNumber; i++)
        {
            Ch = Str.charAt(i);
            StrNew += Ch;    
        }
        StrCpy1 = StrNew;
        System.out.println(StrCpy1);
    }
}

public class program123 {
    public static void main(String[] args) {
        String SName = null, SName1 = null;
        int iNum = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        XString XSobj = new XString();

        XSobj.StrNCpyX(SName,SName1,iNum);
    }
}


