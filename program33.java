/*Accept N number from user and return different between frequancy of even numbers and odd numbers.
Input:    N :         7
          Elements :  85  66  3  80  93  88  90
Output:   1(4-3)
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class ArrayX
{
    public int Frequancy(int iArray[])
    {
        int iCnt = 0, iCntEven = 0, iCntOdd = 0, iFreq = 0;

        for(iCnt = 0; iCnt < iArray.length; iCnt++)
        {
            if((iArray[iCnt] % 2) == 0)
            {
                iCntEven++;                
            }
            else
            {
                iCntOdd++;
            }            
        }        
        iFreq = iCntEven - iCntOdd;
        return iFreq;
    }
}

public class program33 {
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
        iRet = Aobj.Frequancy(iArr);
        System.out.println(" Different between frequancy of even numbers and odd numbers is : "+iRet);
    }    
}
