/*
Write a program which accept string from user and accept one character Return index 
of first occurrence of that character.
    
    Input : Marvellous Multi OS
          :   M
    Output : 0
    Input : Marvellous Multi OS
          :   W
    Output : -1
    Input : Marvellous Multi OS
          :   e
    Output : 4

*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int FirstChar(String Str, char Ch)
    {
        int i = 0, iFirstCnt = 0;
        char CStr = '\0';

        for(i = 0; i < Str.length(); i++,iFirstCnt++)
        {
            CStr = Str.charAt(i);
            if(CStr == Ch)
            {
                return iFirstCnt;
            }
        }
        return -1;
    }
}

public class program119 {
    public static void main(String[] args) {
        String SName = null;
        char ch = '\0';

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        System.out.println("Enter Character to Check : "+ch);
        ch = Sobj.next().charAt(0);

        XString XSobj = new XString();

        int iRet = 0;
        iRet = XSobj.FirstChar(SName,ch);
        
        System.out.printf("First character occurance of position is : "+iRet);
    }
}

