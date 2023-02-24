/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 3   icolumn = 5
Output:  A	A	A	A	A
         B	B	B	B	B
		 C	C	C	C	C
*/	
////////////////////////////////////////////////////////////////////////////////////// 

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1,ch='A'; i <= iRow; i++,ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }               
    }
}

public class program59 {
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