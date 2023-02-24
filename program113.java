/*
   Write a Program which accept string from user and convert it into Upper Case.c
      Input : "Marvellous Multi OS"
      Output : MARVELLOUS MULTI OS
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
        }
        
        for(int i = 0; i < StrArr.length; i++)
        {
            System.out.print(StrArr[i]);
        }
    }
}

public class program113 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();

        XSobj.StrUprc(SName);
    }
}

