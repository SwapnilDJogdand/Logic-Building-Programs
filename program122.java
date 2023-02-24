/*
Write a program which accept string from user and copy the contents of that string into another string. (Implement strcpy() function)
     Input : Marvellous Multi OS
     Output : Marvellous Multi OS
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrCpyX(String Str, String Str1)
    {
        Str1 = Str;
        System.out.println("Orignal String : "+Str);
        System.out.println("Copy String : "+Str1);
    }
}

public class program122 {
    public static void main(String[] args) {
        String SName = null, SName1 = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrCpyX(SName,SName1);
    }
}


