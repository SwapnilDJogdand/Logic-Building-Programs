/*
  Write a program which accept string from user and display it in Reverse Order.c
  Input :  MarvellouS
  Output : SuollevraM
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public void Reverse(String Str)
    {
        char Ch = '\0';
        String Str1 = "";

        for(int i = 0; i < Str.length(); i++)
        {
            Ch = Str.charAt(i);
            Str1 = Ch + Str1;
        }    
        System.out.println("Reversed String is : "+ Str1);
    }
}

public class program111 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.Reverse(SName);
    }
}

