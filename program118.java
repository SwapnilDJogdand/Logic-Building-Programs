/*
Write a program which accept string from user and accept one character Return Frequency Of That Character.c
    Input  : Marvellous Multi OS
           :  M
    Output :  2
    Input  : Marvellous Multi OS
           :  W
    Output :  0
*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int CountChar(String Str, char Ch)
    {
        char StrArr[] = Str.toCharArray();
        int iCntFreq = 0;

        for(int i = 0; i < StrArr.length; i++)
        {
            if(StrArr[i] == Ch)
            {
                iCntFreq++;
            }
        }
        return iCntFreq;
    }
}

public class program118 {
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
        iRet = XSobj.CountChar(SName,ch);
        
        System.out.printf("%c character frequency is : %d",ch,iRet);
    }
}

