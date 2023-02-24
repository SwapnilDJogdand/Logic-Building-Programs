/*write a program which accept number from user and display its factors in decreasing order
Input: 12
Ouput: 6	4	3	2	1
*/
///////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number
{
    public void DisplayRevFact(int iNum)
    {
        for(int iCnt = (iNum/2); iCnt >= 1; iCnt--)
        {
            if(iNum % iCnt == 0)
            {
                System.out.print("\t"+iCnt);
            }
        }        
    }
}

public class program13 {
    public static void main(String[] args) {
        int iNo = 0;
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Number Nobj = new Number();
        Nobj.DisplayRevFact(iNo);
    }
}
