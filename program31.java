/*Accept N number from user and display all such elements which are multiples of 11.
Input:    N :         6
          Elements :  85  66  3  55  93  88
Output:   66  55  88
*/
//////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public void Display(int iArray[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if(((iArray[iCnt] % 11) == 0))
            {
                System.out.print("\t"+iArray[iCnt]);                
            }            
        }        
    }
}

public class program31 {
    public static void main(String[] args) {
        int iNo = 0;
        
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
        System.out.println("Elements which are multiples of 11 is : ");
        Aobj.Display(iArr);
    }    
}
