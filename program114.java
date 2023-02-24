/*
        Write a Program which accept string from user and toggle the case.c
        Input : "Marvellous Multi OS"
        Output : mARVELLOUS mULTI os
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void StrUprc(String Str)
    {
        char StrArr[] = Str.toCharArray();

        for(int i = 0; i < StrArr.length; i++)
        {
            if(StrArr[i] >= 'a' && StrArr[i] <= 'z')
            {
                StrArr[i] = (char) (StrArr[i] - 32);
            }
            else if(StrArr[i] >= 'A' && StrArr[i] <= 'Z')
            {
                StrArr[i] = (char) (StrArr[i] + 32);
            }
        }
        
        for(int i = 0; i < StrArr.length; i++)
        {
            System.out.print(StrArr[i]);
        }
    }
}

public class program114 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrUprc(SName);
    }
}

