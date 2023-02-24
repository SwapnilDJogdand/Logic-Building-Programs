/*
write a recursive program which accept string from user and count white spaces.
Input: HE llo WOr LD   
Output:  3
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class StringX {
    public static int CountSpace(String Str) {
        int iCnt = 0;
     
        if(Str.length() == 0)
            return 0;
        else
            return (Str.charAt(0) == ' ' ? 1 : 0) + CountSpace(Str.substring(1));
    }
}

public class program162 {
    public static void main(String[] args) {
        String Str;
        int iRet = 0;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        Str = Sobj.nextLine();

        StringX Xobj = new StringX();
        iRet = Xobj.CountSpace(Str);
        System.out.println("Count Space is : "+iRet);
    }
}
