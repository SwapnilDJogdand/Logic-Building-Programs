/* Program to Check Number is Even or Odd
Input : 3
Output: Odd Number 

Input : 2
Output: Even Number
*/
///////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Check {
    public boolean Chk_Even_Odd(int iNum) {
        if (iNum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

public class program7 {
    public static void main(String[] args) {
        int iNo = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Check Cobj = new Check();
        bRet = Cobj.Chk_Even_Odd(iNo);

        if (bRet == true) {
            System.out.println(iNo + " Number is Even");
        } else {
            System.out.println(iNo + " Number is Odd");
        }
    }
}
