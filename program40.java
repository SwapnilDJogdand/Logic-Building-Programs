/*Accept N numbers from user and accept range, display all elements from that range.
Input:      N:        6
            Start:    60
            End:      90
			Elements: 85  66  3  76  93  88
Output:  85  66  76  88			
*/
///////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX
{
    public void DisplayRange(int iArray[], int iStart, int iEnd)
    {
        int iCnt = 0;

        System.out.println(" Elements from that range is : ");
        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt]) >= iStart && iArray[iCnt] <= iEnd)
            {
                System.out.print("\t"+iArray[iCnt]);
            }    
        }    
    }
}

public class program40 {
    public static void main(String[] args) {
        int iNo = 0, iStart = 0, iEnd = 0;
        
        Scanner Sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        System.out.println("Enter iStart : ");
        iStart = Sobj.nextInt();

        System.out.println("Enter iEnd : ");
        iEnd = Sobj.nextInt();

        int iArr[] = new int[iNo];

        System.out.println("Enter "+iNo+ " Elements :");

        for(int iCnt = 0; iCnt < iArr.length; iCnt++)
        {
            System.out.println("Enter Element "+iCnt);
            iArr[iCnt] = Sobj.nextInt();
        }

        ArrayX Aobj = new ArrayX();
        Aobj.DisplayRange(iArr,iStart,iEnd);
    }    
}
