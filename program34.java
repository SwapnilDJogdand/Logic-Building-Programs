/*Accept N number from user check whether that numbers contains 11 in it or not.
Input:    N :         6
          Elements :  85  66  11  80  93  88  
Output:   11 is present
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public boolean Check(int iArray[])
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt]) == 11)
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

public class program34 {
    public static void main(String[] args) {
        int iNo = 0;
        boolean bRet = false;
        
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
        bRet = Aobj.Check(iArr);
        
        if(bRet == true )
        {
            System.out.println("11 is Present");
        }
        else
        {
            System.out.println("11 is not Present");
        }
    }    
}
