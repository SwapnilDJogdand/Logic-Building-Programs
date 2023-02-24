/*Accept number from user and display bellow pattern
Input: 8
Output: 2	4	6	8	10	12	14	16
*/
//////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int i = 0, iMult = 2;

        for(i = 1; i <= iNo; i++)
        {
            System.out.print(iMult*i + "\t");
        }
    }
}

public class program51 {
    public static void main(String[] args) {
        int iNum = 0;
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Pattern Pobj = new Pattern();
        Pobj.Display(iNum);
    }
}