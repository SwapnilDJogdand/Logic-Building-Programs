/*
Write a program which 2 strings from user and concat second string after first string. (Implement strcat() function).
          Input : Marvellous Infosystems
                  Logic Building
          Output : Marvellous Infosystems Logic Building
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class XString
{
    public void StrCatX(String Str1, String Str2)
    {
      StringBuilder SName1 = new StringBuilder(Str1+" ");
      StringBuilder SName2 = new StringBuilder(Str2);
      StringBuilder SConcat = SName1.append(Str2);
      System.out.println(SConcat.toString());
    }
}

public class program126 {
    public static void main(String[] args) {
        String SName1 = null, SName2 = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        SName1 = Sobj.nextLine();

        System.out.println("Enter the String2 : ");
        SName2 = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCatX(SName1,SName2);
    }
}



