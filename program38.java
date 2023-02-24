/*Accept N number from user and accept one another number as NO, return index of first occurance of that NO.
Input:    N :         6
          NO:         66
          Elements :  85  66  3  66  93  88  
Output:   1

Input:    N :         6
          NO:         12
          Elements :  85  11  3  15  11  111  
Output:   -1

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public int FirstOccurance(int iArray[], int iNum)
    {
        int iCnt = 0, iNo = 0;

        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt]) == iNum)
            {
                iNo = iCnt;
                break;
            }    
        }    
        if(iCnt == iArray.length)
        {
            return -1;
        }
        else
        {
            return iNo;
        }
    }
}

public class program38 {
    public static void main(String[] args) {
        int iNo = 0, iNumber = 0, iRet = 0;
        
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
        iRet = Aobj.FirstOccurance(iArr, iNumber);

        System.out.println();
        if(iRet == -1)
        {
            System.out.println("There is no such a number");
        }   
        else
        {
            System.out.println(iNumber+" First Occurance is : "+ iRet);
        }
    }    
}
