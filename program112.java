/*
  Write a program which accept string from user and convert it into lower case.c
	Input : MarvellouS Multi OS
	Output : marvellous multi os
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void Strlwrc(String Str)
    {
        char StrArr[] = Str.toCharArray();

        for(int i = 0; i < StrArr.length; i++)
        {
            if(StrArr[i] >= 'A' && StrArr[i] <= 'Z')
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

public class program112 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.Strlwrc(SName);
    }
}

