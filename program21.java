/*write a number which accept number from user and count frequancy of such a digit and less than 6.
Input: 2395
Output: 3

Input: 1018
Output: 3

Input: 23495
Output: 4

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

            if(iRem < 6)
            {
                iCnt++;
            }
            iNo /= 10;
        }
        return iCnt;
    }
}

public class program21 {
    public static void main(String[] args) {
        int iNum = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Digits Dobj = new Digits();        
        iRet = Dobj.CountFreq(iNum);

        System.out.println("Frequancy is : "+iRet);
    }
}

