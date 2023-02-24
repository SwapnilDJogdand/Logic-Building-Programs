/*
write a recursive program which accept string from user and count number of small charaters.
Input: HElloWOrlD 
Output:  5
*/
/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class StringX {
    public static int CountSmall(String Str) {
        int iCnt = 0;
        
        if(Str.length() == 0)
            return 0;
        else
            return CountSmall(Str.substring(1)) + (Character.isLowerCase(Str.charAt(0)) ? 1 : 0);
}
}

public class program164 
{
    public static void main(String[] args) 
    {
        String Str;
        int iRet = 0;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        Str = Sobj.nextLine();

        StringX Xobj = new StringX();
        iRet = Xobj.CountSmall(Str);
        System.out.println("In String Small Character Count is : "+iRet);
    }
}