/*
Write a program which accept one number from user and range of positions from user. Toggle all bits from that range.
Input: 879	9	13
Output: 7279
Toggle all bits from position 9 to 13 of input number ie879.
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int ToggleBit(int iNo, int iStart,int iEnd) {
        int iNum = 0;
        iNum = ((1 << iEnd) - 1) ^ (( 1 << (iStart - 1)) - 1); 
        return (iNo ^ iNum);
    }
}

class program151 {
    public static void main(String[] args) {
        int iValue = 0, iStart = 0, iEnd = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();

        System.out.println("Enter Start : ");
        iStart = Sobj.nextInt();
       
        System.out.println("Enter End : ");
        iEnd = Sobj.nextInt();

        BitX Bobj = new BitX();
        iRet = Bobj.ToggleBit(iValue,iStart,iEnd);
        System.out.println(iRet);
    }
}