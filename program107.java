/* Write a program which accept string from user and count number of capital characters.
   Input  : "Marvellous Multi OS"
   Output :  4
*/
///////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public int CountCapital(String Str)
    {
        int iCnt = 0;

        for(int i = 0; i < Str.length(); i++)
        {
            char Ch = Str.charAt(i);
            
            if(Ch >= 'A' && Ch <= 'Z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

public class program107 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();
        
        int iRet = 0;
        iRet = XSobj.CountCapital(SName);
        
        System.out.println("In String Capital Character Count is : "+ iRet);
    }
}
