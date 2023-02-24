/* write a program with accept number from user  and display its multiplaication of factors. 
Input: 12
Output: 144    (1*2*3*4*6)
*/
//////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Number {
    public int MultFact(int iNum) {
        int iMult = 1;
        for (int iCnt = 1; iCnt <= (iNum / 2); iCnt++) {
            if (iNum % iCnt == 0) {
                iMult *= iCnt;
            }
        }
        return iMult;
    }
}

public class program12 {
    public static void main(String[] args) {
        int iNo = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Number Nobj = new Number();
        int iRet = Nobj.MultFact(iNo);

        System.out.println("Multiplication of factors is : " + iRet);
    }
}
