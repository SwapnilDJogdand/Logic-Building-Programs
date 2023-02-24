/*Accept number of rows and cnumber of columns from user and display below pattern.
Input:   iRow = 5   icolumn = 5
Output:  1	2	3	4	5
        -1	-2	-3	-4	-5
		1	2	3	4	5
		-1	-2	-3	-4	-5
		1	2	3	4	5
	
*/	
///////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iNum1 = 1, iNum2 = -1;

        for(i = 1; i <= iRow; i++)
        {
            iNum1 = 1;
            iNum2 = -1;
            
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(" "+iNum1 +"\t");
                    iNum1++;
                }
                else
                {
                    System.out.print(iNum2+"\t");
                    iNum2--;
                }
            }
            System.out.println();
        }               
    }
}

public class program65 {
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