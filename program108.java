/*
 Write a program which accept string from user and count number of small characters.
 Input : "Marvellous"
 Output : 9
*/ 
///////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int CountSmall(String Str)
    {
        int iCnt = 0;

        for(int i = 0; i < Str.length(); i++)
        {
            char Ch = Str.charAt(i);
            
            if(Ch >= 'a' && Ch <= 'z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

public class program108 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();
        
        int iRet = 0;
        iRet = XSobj.CountSmall(SName);
        
        System.out.println("In String Small Character Count is : "+ iRet);
    }
}

