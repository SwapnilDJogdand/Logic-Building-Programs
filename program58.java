/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 4   icolumn = 4
Output:  A	B	C	D
         a	b	c	d
		 A	B	C	D
         a	b	c	d
*/	
/////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = '\0', ch2 = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch1 = 'A',ch2 = 'a'; j <= iCol; j++,ch1++,ch2++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch2+"\t");
                }
                else
                {
                    System.out.print(ch1+"\t");
                }
            }
            System.out.println();
        }               
    }
}

public class program58 {
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