/* write a program which accept number from user and return the count of even digits.
Input: 2395
Output: 1

Input: 1018
Output: 2
*/
///////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits
{
    public int CountEven(int iNo)
    {
        int iCnt = 0, iRem = 0;
        
        while(iNo != 0)
        {
            iRem = iNo % 10;

            if((iRem % 2) == 0)
            {
                iCnt++;
            }
            iNo /= 10;
        }
        return iCnt;
    }
}

public class program22 {
    public static void main(String[] args) {
        int iNum = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Digits Dobj = new Digits();        
        iRet = Dobj.CountEven(iNum);

        System.out.println("Even Digit Frequancy is : "+iRet);
    }
}

