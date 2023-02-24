/*Accept number of rows and cnumber of columns from user and display bellow pattern.
Input:   iRow = 4   icolumn = 4
Output:  A	B	C	D
         A	B	C	D
		 A	B	C	D
         A	B	C	D
*/
///////////////////////////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'A'; j <= iCol; j++,ch++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }               
    }
}

public class program57 {
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