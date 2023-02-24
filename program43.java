/*Accept N numbers from user and return the Minimun numbers.
Input:      N:        6
			Elements: 85  66  3  66  93  88
Output:  3			
*/
/////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public int Minimum(int iArray[])
    {
           int iCnt = 0;
           int iMin = iArray[0];

           for(iCnt = 0; iCnt < iArray.length; iCnt++)
           {
                if(iMin > iArray[iCnt])
                {
                    iMin = iArray[iCnt];
                }
           }
           return iMin;
    }
}

public class program43 {
    public static void main(String[] args) {
        int iNo = 0, iRet = 0;
        
        Scanner Sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        int iArr[] = new int[iNo];

        System.out.println("Enter "+iNo+ " Elements :");

        for(int iCnt = 0; iCnt < iArr.length; iCnt++)
        {
            System.out.println("Enter Element "+iCnt);
            iArr[iCnt] = Sobj.nextInt();
        }

        ArrayX Aobj = new ArrayX();
        iRet = Aobj.Minimum(iArr);

        System.out.println("Minimum value is : "+iRet);
    }    
}
