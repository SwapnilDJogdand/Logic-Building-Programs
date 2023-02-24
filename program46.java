/*Accept N numbers from user and display sumation of digits of each number.
Input:      N:        6
			Elements: 8225  665  3  76  953  958
Output:  17  17  3  13  17  22		


*/
//////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ArrayX {
    public void DigitSum(int iArray[]) {
        int iCnt = 0, iRem = 0, iSum = 0, iTemp = 0;

        for (iCnt = 0; iCnt < iArray.length; iCnt++) {
            iTemp = iArray[iCnt];
            iSum = 0;

            while (iTemp > 0) {
                iRem = iTemp % 10;
                iSum += iRem;
                iTemp /= 10;
            }
            System.out.print("\t" + iSum);
        }
    }
}

public class program46 {
    public static void main(String[] args) {
        int iNo = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        int iArr[] = new int[iNo];

        System.out.println("Enter " + iNo + " Elements :");

        for (int iCnt = 0; iCnt < iArr.length; iCnt++) {
            System.out.println("Enter Element " + iCnt);
            iArr[iCnt] = Sobj.nextInt();
        }

        ArrayX Aobj = new ArrayX();
        Aobj.DigitSum(iArr);
    }
}
