/*write a program which acccept number from user and count frequancy of 4 in it.
Input: 2395
Output: 0

Input: 9440
Output: 2

*/
//////////////////////////////////////////////////////////////////////////////////////////


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

            if(iRem == 4)
            {
                iCnt++;
            }
            iNo /= 10;
        }
        return iCnt;
    }
}

public class program20 {
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

