/*Accept number of rows and cnumber of columns from user and display below pattern.
Input:   iRow = 4   icolumn = 4
Output:  2	4	6	8
         1	3	5	7
		 2	4	6	8
		 1  3	5   7

*/
/////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0, j = 0;
        int iNum = 1;

        for (i = 1; i <= iRow; i++) {
            iNum = 1;
            for (j = 1; j <= iCol; j++) {
                if (i % 2 != 0) {
                    System.out.print(j * 2 + "\t");
                } else {
                    System.out.print(iNum + "\t");
                    iNum += 2;
                }
            }
            System.out.println();
        }
    }
}

public class program63 {
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