/*
Write a program which accept one number, two positions from user and check whether bit at first or bit at second position is ON or OFF.c
Input: 10  3  7 
Output: TRUE
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class BitX {
    public boolean ChkBits(int iNo,int iPos1,int iPos2) {
        int iNum1 = iNo >> (iPos1-1);
        
        if((iNo & iNum1) != 0)
        {
            return true;
        }
        return false;
    }
}

class program150 {
    public static void main(String[] args) {
        int iValue = 0, iValue1 = 0, iValue2 = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = Sobj.nextInt();
       
        System.out.println("Enter first position : ");
        iValue1 = Sobj.nextInt();
       
        System.out.println("Enter second position : ");
        iValue2 = Sobj.nextInt();

        BitX Bobj = new BitX();
        bRet = Bobj.ChkBits(iValue,iValue1,iValue2);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }  
        else{
            System.out.println("FALSE");
        }     
    }
}