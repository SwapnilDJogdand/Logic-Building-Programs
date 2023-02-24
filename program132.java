/*
Write a program which checks whether 15th bit is On or OFF.c
*/
///////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class bit
{
    public boolean ChkBit(int iNo)
    {
        int iMask = 16384;
        int iResult = 0;

        iResult = iMask & iNo;

        if(iResult == 0)
        {
            return true;
        }
        return false;
    }
}

public class program132
{
    public static void main(String[] args) {
        int iValue = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Value : ");
        iValue = Sobj.nextInt();

        bit bobj = new bit();

        bRet = bobj.ChkBit(iValue);
        
        if(bRet == true)
        {
            System.out.println("Bit is On");
        }
        else
        {
            System.out.println("Bit is Off");
        }
    }
}
