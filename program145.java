/*
 Write a program which accept one number and position from user and toggle that bit. Return modified number.c
 Input: 10	3
 Output: 14
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int ToggleBit(int iNo, int iPos) {
        int iMask = 0X00000001;
        int iResult = 0;

        iMask = iMask << (iPos-1);
        
        iResult = iNo | iMask;

        return iResult;
    }
}

class program145 {
    public static void main(String[] args) {
        int iValue = 0, iValue1 = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        System.out.println("Enter Position : ");
        iValue1 = Sobj.nextInt();

        BitX Bobj = new BitX();
        iRet = Bobj.ToggleBit(iValue,iValue1);
        System.out.println(iRet);
    }
}