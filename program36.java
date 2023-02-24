/*Accept N number from user and accept one another number as NO, return frequancy of NO form it.
Input:    N :         6
          NO:         66
          Elements :  85  66  3  66  93  88  
Output:   2

Input:    N :         6
          NO:         12
          Elements :  85  11  3  15  11  111  
Output:   0
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public int CheckFreq(int iArray[], int iNum)
    {
        int iCnt = 0, iFreq = 0;

        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt]) == iNum)
            {
                iFreq++;   
            }    
        }    
        return iFreq;
    }
}

public class program36 {
    public static void main(String[] args) {
        int iNo = 0, iRet = 0, iNumber = 0;
        
        Scanner Sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        System.out.println("Enter value that you want to Search : ");
        iNumber = Sobj.nextInt();

        int iArr[] = new int[iNo];

        System.out.println("Enter Elements : ");
        for(int iCnt = 0; iCnt < iArr.length; iCnt++)
        {
            iArr[iCnt] = Sobj.nextInt();
        }

        ArrayX Aobj = new ArrayX();
        iRet = Aobj.CheckFreq(iArr, iNumber);
        System.out.println("\n"+iNumber+" number Frequancy is : "+iRet);
    }    
}
