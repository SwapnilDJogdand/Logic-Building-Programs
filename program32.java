/*Accept N number from user and return frequancy of even numbers.
Input:    N :         6
          Elements :  85  66  3  80  93  88
Output:   3
*/
/////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public int CountEven(int iArray[])
    {
        int iCnt = 0, iCntEven = 0;
        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt] % 2) == 0)
            {
                iCntEven++;                
            }            
        }        
        return iCntEven;
    }
}

public class program32 {
    public static void main(String[] args) {
        int iNo = 0, iRet = 0;
        
        Scanner Sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        int iArr[] = new int[iNo];

        System.out.println("Enter Elements : ");
        for(int iCnt = 0; iCnt < iArr.length; iCnt++)
        {
            iArr[iCnt] = Sobj.nextInt();
        }

        ArrayX Aobj = new ArrayX();
        iRet = Aobj.CountEven(iArr);
        System.out.println("Frequancy of even numbers is : "+iRet);
    }    
}
