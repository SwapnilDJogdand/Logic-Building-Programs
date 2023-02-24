/* write a program which accept number from user and return differce between sumation
of even digits and sumation of odd digits.
Input: 2395
Output: -15   (2-17)

Input: 1018
Output: 6     (8-2)

*/
///////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits {
    public int CountRange(int iNo) {
        int iDigit = 0, iSumEven = 0, iSumOdd = 0, iSum = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;

            if ((iDigit % 2) == 0) {
                iSumEven += iDigit;
            } else {
                iSumOdd += iDigit;
            }
            iNo /= 10;
        }
        iSum = iSumEven - iSumOdd;
        return iSum;
    }

    public int SumDigit(int iNum) {
        return 0;
    }
}

public class program26 {
    public static void main(String[] args) {
        int iNum = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        iNum = Sobj.nextInt();

        Digits Dobj = new Digits();
        iRet = Dobj.CountRange(iNum);

        System.out.println("Diffrence of Even or Odd Summation is : " + iRet);
    }
}
