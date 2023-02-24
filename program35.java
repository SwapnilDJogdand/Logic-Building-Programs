/*Accept N number from user and return frequancy of 11 form it.
Input:    N :         6
          Elements :  85  66  3  15  93  88  
Output:   0

Input:    N :         6
          Elements :  85  11  3  15  11  111  
Output:   2
*/
/////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class ArrayX
{
    public int CheckFreq(int iArray[])
    {
        int iCnt = 0, iFreq = 0;

        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt]) == 11)
            {
                iFreq++;   
            }    
        }    
        return iFreq;
    }
}

public class program35 {
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
        iRet = Aobj.CheckFreq(iArr);
        System.out.println("11 Frequancy is : "+iRet);
    }    
}
