/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 3   icolumn = 4
Output:  1	2	3	4
         5	6	7	8
		 9	10	11	12

*/	
///////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iNum = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iNum+"\t");
                iNum++;
            }
            System.out.println();
        }               
    }
}

public class program61 {
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