/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 3   icolumn = 5
Output:  5	 4	3	2	1 
         5	 4	3	2	1
		 5	 4	3	2	1
*/
/////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }               
    }
}

public class program54 {
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