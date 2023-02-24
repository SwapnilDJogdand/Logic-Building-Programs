/*Accept N numbers from user and display all such numbers which contains 3 digits in it.
Input:      N:        6
			Elements: 8225  665  3  76  953  958
Output:  665  953  858			
*/
///////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public void Digit(int iArray[])
    {
           int iCnt = 0;

           for(iCnt = 0; iCnt < iArray.length; iCnt++)
           {
                if(iArray[iCnt] > 99 && iArray[iCnt] < 1000)
                {
                    System.out.print("\t"+iArray[iCnt]);
                }
           }
    }
}

public class program45 {
    public static void main(String[] args) {
        int iNo = 0;
        
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
        System.out.println("Numbers which contains 3 digits is : ");
        Aobj.Digit(iArr);
    }    
}
