/*
	Write a Program which accept string from user and Display Only Digits from that string.c
    Input : "Marve89llous121"
    Output : 89121
*/
//////////////////////////////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class XString
{
    public void DisplayDigit(String Str)
    {
        char StrArr[] = Str.toCharArray();
        
        for(int i = 0; i < StrArr.length; i++)
        {
            if(StrArr[i] >= '0' && StrArr[i] <= '9')
            {
                System.out.print(StrArr[i]);
            }
        }
    }
}

public class program115 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.DisplayDigit(SName);
    }
}

