/*Accept N numbers from user and return the largest numbers.
Input:      N:        6
			Elements: 85  66  3  66  93  88
Output:  93			
*/
//////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public int Maximum(int iArray[])
    {
           int iMax = 0, iCnt = 0;
           for(iCnt = 0; iCnt < iArray.length; iCnt++)
           {
                if((iArray[iCnt]) > iMax)
                {
                    iMax = iArray[iCnt];
                }
           }
           return iMax;
    }
}

public class program42 {
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
        iRet = Aobj.Maximum(iArr);

        System.out.println("Maximum value is : "+iRet);
    }    
}
