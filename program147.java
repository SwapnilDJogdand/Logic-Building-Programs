/*
Write a program which accept one number from user and count number of ON (1) bits in it without using % and / operator.
Input: 11
Output: 3
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int CountOne(int iNo) {
        int iMask = 1011;
        int iCnt = 0;
        
        iNo = iMask & iNo;

        for(int i = 0; i < iNo; i++)
        {
            iCnt++;
        }
        return iCnt;
    }
}

class program147 {
    public static void main(String[] args) {
        int iValue = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        BitX Bobj = new BitX();
        iRet = Bobj.CountOne(iValue);

        System.out.println(iRet);
    }
}