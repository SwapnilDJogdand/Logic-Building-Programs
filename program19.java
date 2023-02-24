/*write a program which acccept number from user and count frequancy of 2 in it.
Input: 23995
Output: 1

Input: 1018
Output: 0
*/
////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits
{
    public int CountFreq(int iNo)
    {
        int iCnt = 0, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 2)
            {
                iCnt++;
            }
            iNo /= 10;
        }
        return iCnt;
    }
}

public class program19 {
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
