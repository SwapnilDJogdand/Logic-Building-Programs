/*
Write a program which checks whether first and last bit is On or OFF. First bit means bit number 1 and last 
bit means bit number 32.
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class bit {
    public boolean ChkBit(int iNo) {
        if(iNo == 1)
	    {
		    return true;
	    }
        
        if(iNo == 2)
        {
            return false;
        }
	    return (((iNo-1) & (iNo-2)) == 0);
    }
}

public class program136 {
    public static void main(String[] args) {
        int iValue = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Value : ");
        iValue = Sobj.nextInt();

        bit bobj = new bit();

        bRet = bobj.ChkBit(iValue);

        if (bRet == true) {
            System.out.println("Bit is On");
        } else {
            System.out.println("Bit is Off");
        }
    }
}

