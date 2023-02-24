/* write a program which accept number from user and return differce between sumation of all its factors and non factors.
Input: 12
Output: -34   (16-50)
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
    public int iNum;

    Number(int i)
    {
        this.iNum = i;
    }

    public int DisplayDiff()
    {
        int iCnt = 0, iFactSum = 0, iNFactSum = 0, iDiff = 0;

        for(iCnt = 1; iCnt <= (iNum/2); iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iFactSum += iCnt;
            }
        }

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if(iNum % iCnt != 0)
            {
                iNFactSum += iCnt;
            }
        }

        iDiff = iFactSum - iNFactSum;
        return iDiff;
    }
}

public class program16 {
  public static void main(String[] args) {
    int iNo = 0, iRet = 0;
    
    Scanner Sobj = new Scanner(System.in);

    System.out.println("Enter Number : ");
    iNo = Sobj.nextInt();

    Number Nobj = new Number(iNo);
    iRet = Nobj.DisplayDiff();

    System.out.println("Summation of Factors & NonFactors is : "+iRet);
  }    
}
