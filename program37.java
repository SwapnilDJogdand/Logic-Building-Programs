/*Accept N number from user and accept one another number as NO, check whether NO is present or not.
Input:    N :         6
          NO:         66
          Elements :  85  66  3  15  93  88  
Output:   TRUE

*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public boolean Check(int iArray[], int iNum)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt]) == iNum)
            {
                bFlag = true;
                break;   
            }    
            else
            {
                bFlag = false;
            }
        }    
        return bFlag;
    }
}

public class program37 {
    public static void main(String[] args) {
        int iNo = 0, iNumber = 0;
        boolean bRet = false;
        
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
        bRet = Aobj.Check(iArr, iNumber);

        if(bRet == true)
        {
            System.out.println(iNumber+" Number is Present");
        }
        else
        {
            System.out.println(iNumber+" Number is not Present");
        }
    }    
}
