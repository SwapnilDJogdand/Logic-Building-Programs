/* Accept number of rows and columns from user and display bellow pattern.

Input:  row  4  column  4

Output :   1	2	3	4
           1	*	*	4
		   1	*	*	4
		   1	2	3	4

*/

/////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        System.out.println("/////////////////////////////////////////");

        for(i = 1; i <= iRow; i++)
        {   
            for(j = 1; j <= iCol; j++)
            {
                if(i == 1 || j == 1 || i == iRow || j == iCol)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print("@"+"\t");
                }
            }
            System.out.println();
        } 
        System.out.println("/////////////////////////////////////////");              
    }
}

public class program71 {
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