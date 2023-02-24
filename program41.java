/*Accept N numbers from user and return product of all odd elements
Input:      N:        6
			Elements: 15  66  3  70  10  88
Output:  45			
*/
/////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public int Product(int iArray[])
    {
           int iProduct = 1, iCnt = 0;
           for(iCnt = 0; iCnt < iArray.length; iCnt++)
           {
                if((iArray[iCnt] % 2) != 0)
                {
                    iProduct *= iArray[iCnt];
                }
           }
           return iProduct;
    }
}

public class program41 {
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
        iRet = Aobj.Product(iArr);

        System.out.println("Product is : "+iRet);
    }    
}
