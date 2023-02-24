/*write a program which accept number from user and display all its non factors.

Input: 12
Output: 5	7	8	9	10	11
*/
////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
    public int iNo;
    
    Number(int i)
    {
        this.iNo = i;
    }

    public void Display_NonFact()
    {
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print("\t"+iCnt);
            }
        }
    }
}

public class program14 {
    public static void main(String[] args) {
        int iNum = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Number Nobj = new Number(iNum);
        Nobj.Display_NonFact(); 
    }
}
