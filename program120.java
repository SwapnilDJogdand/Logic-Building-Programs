/*
Statements 29.4 Write a program which accept string from user and accept one character Return index of Last occurrence of that character.
    Input : Marvellous Multi OS
          :   M
   Output : 11
    Input : Marvellous Multi OS
          :   W
   Output : -1
    Input : Marvellous Multi OS
          :   e
   Output : 4

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int LastChar(String Str, char Ch)
    {
        for(int i = Str.length() - 1; i > 0; i--)
        {
            if(Str.charAt(i) == Ch)
            {
                return i;
            }
        }
        return -1;
    }
}

public class program120 {
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
        iRet = XSobj.LastChar(SName,ch);
        
        System.out.printf("Last character occurance of position is : "+iRet);
    }
}
