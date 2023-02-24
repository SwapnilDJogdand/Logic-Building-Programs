/*
Write a program which accept two numbers from user and display position of common ON bits from that two numbers.
Input: 10  15  (1010   1111)
Output: 2   4
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int[] CommanBits(int iNo,int iNo1) {
        int[] iCnt = new int[2];
        
        while(iNo > 0)
        {
            iCnt[0] += iNo & 1;
            iNo >>= 1;
        }        
        while(iNo1 > 0)
        {
            iCnt[1] += iNo1 & 1;
            iNo1 >>= 1;
        }   
        return iCnt;
    }
}

class program148 {
    public static void main(String[] args) {
        int iValue = 0, iValue1 = 0;
        int[] iRet;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        System.out.println("Enter number : ");
        iValue1 = Sobj.nextInt();

        BitX Bobj = new BitX();
        iRet = Bobj.CommanBits(iValue,iValue1);

        System.out.println(iRet[0] +"\t"+ iRet[1]);
    }
}