/*
Write a program which accept one number from user and off 7th bit of that number if it is on. Return modified number.
Input: 79
Output: 15
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int OffBit(int iNo) {
        // int iMask = 64;
        int iMask = 0X00000040;
        int iResult = 0;

        iResult = iMask ^ iNo;
        return iResult;
    }
}

class program137 {
    public static void main(String[] args) {
        int iValue = 0, iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        BitX Bobj = new BitX();
        iRet = Bobj.OffBit(iValue);

        System.out.println(iRet);
    }
}