/*Accept N number from user and display all such elements which are divisible by 5.
Input:    N :         6
          Elements :  85  66  3  80  93  88
Output:   85  80
*/
/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public void Display(int iArray[])
    {
        for(int iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if(iArray[iCnt] % 5 == 0)
            {
                System.out.print("\t"+iArray[iCnt]);
            }
            else
            {

            }
        }
    }
}

public class program28 {
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

        System.out.println("Elements which are divisible by 5 is : ");
        ArrayX Aobj = new ArrayX();
        Aobj.Display(iArr);
    }
}
