/*
Write a program which accept one number from user and check whether 9th or 12th bit is on or off.c
Input: 257
Output: TRUE
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public boolean ChkBitsON(int iNo) {
        int iMask = 2304;
        int iResult = 0;

        iResult = iMask & iNo;

        if(iResult == 0)
        {
            return false;
        }
        return true;  
    }
}

class program149 {
    public static void main(String[] args) {
        int iValue = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        BitX Bobj = new BitX();
        bRet = Bobj.ChkBitsON(iValue);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }  
        else{
            System.out.println("FALSE");
        }     
    }
}