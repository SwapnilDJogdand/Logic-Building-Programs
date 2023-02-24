/* Accept number of rows and columns from user and display bellow pattern.

Input:  row  5  column  5

Output :   $	*	*	*	*
           #	$	*   *	*
		   #	#	$	*	*
		   #	#	#	$	*
		   #	#	#	#	$
*/

////////////////////////////////////////////////////////////////////////////


import java.lang.*;
import java.util.*;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0, j = 0;

        System.out.println("/////////////////////////////////////////");

        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iCol; j++) {
                if(i == j)
                {
                    System.out.print("$"+"\t");
                }
                else if(j >= i)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print("#"+"\t");
                }
            }
            System.out.println();
        }
        System.out.println("/////////////////////////////////////////");
    }
}

public class program74 {
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