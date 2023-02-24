/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 4   icolumn = 5
Output:  4	4	4	4	4
         3	3	3	3	3
		 2	2	2	2	2
		 1	1	1	1	1
*/	
/////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }               
    }
}

public class program60 {
    public static void main(String[] args) {
        int iNum1 = 0, iNum2 = 0;
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Row : ");
        iNum1 = Sobj.nextInt();

        System.out.println("Enter Column : ");
        iNum2 = Sobj.nextInt();
        
        System.out.println();
        Pattern Pobj = new Pattern();
        Pobj.Display(iNum1,iNum2);
    }
}