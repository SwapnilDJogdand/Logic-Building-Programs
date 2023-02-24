/*
		Write a Program which accept string from user And Count Number Of White Spaces.c
        Input : Marvellous
        Output : 0
        Input : MarvellouS Infosystems
        Output : 1
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int CountWhiteSpace(String Str)
    {
        char StrArr[] = Str.toCharArray();
        int iCnt = 0;

        for(int i = 0; i < StrArr.length; i++)
        {
            if(StrArr[i] == ' ')
            {
                iCnt++;        
            }
        }
        return iCnt;
    }
}

public class program116 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        int iRet = 0;
        iRet = XSobj.CountWhiteSpace(SName);
        System.out.println("In Strint whitespace count is : "+iRet);
    }
}

