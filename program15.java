/*write a program which accept number from user and return sumation of all its non factors
Input: 12
Output: 50
*/
/////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
    public int iNo;
    
    Number(int i)
    {
        this.iNo = i;
    }

    public int Display_NonFact_Summation()
    {
        int iSum = 0;

        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum += iCnt;
            }
        }
        return iSum;
    }
}

public class program15 {
    public static void main(String[] args) {
        int iNum = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Number Nobj = new Number(iNum);
        int iRet = Nobj.Display_NonFact_Summation();

        System.out.println("Non Factors Summation is : "+iRet);
    }
}
