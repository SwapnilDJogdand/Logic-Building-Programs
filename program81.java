/* Accept number of rows and columns from user and display bellow pattern.

Input:  row  5  column  5

Output :  1	 2	3	4	5
          1	 2			5
		  1		3		5
		  1			4	5
		  1	 2	3	4	5
*/

//////////////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0, j = 0;

        System.out.println("/////////////////////////////////////////");

        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iCol; j++) {
                if(i == 1 || j == 1 || i == iRow || j == iCol || i == j)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(" "+"\t");
                }
            }
            System.out.println();
        }
        System.out.println("/////////////////////////////////////////");
    }
}

public class program81 {
    public static void main(String[] args) {
        int iNum1 = 0, iNum2 = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Row : ");
        iNum1 = Sobj.nextInt();

        System.out.println("Enter Column : ");
        iNum2 = Sobj.nextInt();

        System.out.println();
        Pattern Pobj = new Pattern();
        Pobj.Display(iNum1, iNum2);
    }
}