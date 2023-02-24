/*
 Write a program which accept one number from user and toggle contents of first and last nibble of the number. 
 Return modified number. 
 (Nibble is a group of four bits).
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public int ToggleBit(int iNo, int iPos) {
        int iMask = 0XF000000F;
            
        int iResult = 0;

        iMask = iMask << (iPos-1);
        
        iResult = iNo | iMask;

        return iResult;
    }
}

class program146 {
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