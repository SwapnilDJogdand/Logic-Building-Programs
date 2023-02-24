/*
Write a program which accept one number from user and toggle 7th bit of that number. Return modified number.
Input: 137
Output: 201
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int OffBit(int iNo) {
        int iMask = 64;
        int iResult = 0;

        iResult = iMask ^ iNo;
        return iResult;
    }
}

class program139 {
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