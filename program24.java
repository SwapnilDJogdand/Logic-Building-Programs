/* write a program which accept number from user and return the count of digits in betwwen 3 and 7.
Input: 2395
Output: 1

Input: 1018
Output: 0

*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits
{
    public int CountFreq(int iNo)
    {
        int iCnt = 0, iRem = 0;
        
        while(iNo != 0)
        {
            iRem = iNo % 10;

            if((iRem > 3) && (iRem < 7))
            {
                iCnt++;
            }
            iNo /= 10;
        }
        return iCnt;
    }
}

public class program24 {
    public static void main(String[] args) {
        int iNum = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        iNum = Sobj.nextInt();

        Digits Dobj = new Digits();        
        iRet = Dobj.CountFreq(iNum);

        System.out.println("Digits in betwwen 3 and 7 is : "+iRet);
    }
}

