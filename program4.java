// Accept one number and check wheteher is it divisble by 5 or not.

import java.lang.*;
import java.util.*;

class Numbers {
    public boolean Check(int iNum) {
        if (iNum % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class program4 {
    public static void main(String[] args) {
        int iNo = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Numbers Nobj = new Numbers();

        boolean bRet = Nobj.Check(iNo);

        if(bRet == true)
        {
            System.out.println(iNo + " Number is divisible by 5");
        }
        else
        {
            System.out.println(iNo + " Number is not divisible by 5");
        }
    }
}
