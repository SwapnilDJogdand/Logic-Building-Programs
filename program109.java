/*
     Write a program which accept string from user and return difference between frequency
     of small characters and frequency of capital characters.c
     Input : MarvellouS
     Output : 6 (8-2)
*/
/////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int Difference(String Str)
    {
        int iCapital = 0, iSmall = 0, iDifference = 0;

        for(int i = 0; i < Str.length(); i++)
        {
            char Ch = Str.charAt(i);
            
            if(Ch >= 'a' && Ch <= 'z')
            {
                iSmall++;
            }
            else if(Ch >= 'A' && Ch <= 'Z')
            {
                iCapital++;
            }
        }
        iDifference = iSmall - iCapital;
        return iDifference;
    }
}

public class program109 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();
        
        int iRet = 0;
        iRet = XSobj.Difference(SName);
        
        System.out.println("In String Small and Capital Difference Count is : "+ iRet);
    }
}

