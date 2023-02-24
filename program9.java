/*  write a program which accept number from user and print even factors of that number.
Input : 24
Output : 2     4    6   8   12
*/
////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number {
    public void Even_Factors(int iNum) {
        if (iNum < 0) {
            iNum = -iNum;
        }

        for (int iCnt = 1; iCnt <= (iNum / 2); iCnt++) {
            if ((iNum % iCnt == 0) && (iCnt % 2 == 0)) {
                System.out.print(iCnt + "\t");
            }
        }
    }

    public int intValue() {
        return 0;
    }

    public double doubleValue() {
        return 0;
    }

    public double doubleValue() {
        return 0;
    }
}

public class program9 {
    public static void main(String[] args) {
        int iNo = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Number Nobj = new Number();
        Nobj.Even_Factors(iNo);
    }
}
