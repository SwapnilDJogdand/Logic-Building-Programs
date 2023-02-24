/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 4   icolumn = 3
Output:   1	 2	3
          1	 2  3
		  1	 2	3
		  1  2	3
*/
///////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }               
    }
}

public class program53 {
    public static void main(String[] args) {
        int iNum1 = 0, iNum2 = 0;
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number1 : ");
        iNum1 = Sobj.nextInt();

        System.out.println("Enter Number2 : ");
        iNum2 = Sobj.nextInt();

        Pattern Pobj = new Pattern();
        Pobj.Display(iNum1,iNum2);
    }
}