/*
 Write a program which accept string from user and accept one character.Check whether that character 
 is present in string or not.
      Input : Marvellous Multi OS
            :   e
      Output : TRUE
      Input : Marvellous Multi OS
           :   W
      Output : FALSE

*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public boolean ChkChar(String Str, char Ch)
    {
        char StrArr[] = Str.toCharArray();

        for(int i = 0; i < StrArr.length; i++)
        {
            if(StrArr[i] == Ch)
            {
                return true;
            }
        }
        return false;
    }
}

public class program117 {
    public static void main(String[] args) {
        String SName = null;
        char ch = '\0';

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        System.out.println("Enter Character to Check : "+ch);
        ch = Sobj.next().charAt(0);

        XString XSobj = new XString();

        boolean bRet = false;
        bRet = XSobj.ChkChar(SName,ch);
        
        if(bRet == true)
        {
            System.out.println("Character is present");
        }
        else
        {
            System.out.println("Character is not present");
        }
    }
}

