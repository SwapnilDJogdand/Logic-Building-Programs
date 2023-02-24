/*
Write a program which accept one number and position from user and check whether bit at that position is on or off.
If bit is one return TRUE otherwise return FALSE.
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public boolean ChkBit(int iNo, int iPos) {
        int iMask = 0X00000001;
        int iResult = 0;

        iMask = iMask << (iPos-1);
        
        iResult = iNo & iMask;

        if(iResult == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class program142 {
    public static void main(String[] args) {
        int iValue = 0, iValue1 = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        System.out.println("Enter Position : ");
        iValue1 = Sobj.nextInt();

        BitX Bobj = new BitX();
        bRet = Bobj.ChkBit(iValue,iValue1);

        System.out.println(bRet);
    }
}