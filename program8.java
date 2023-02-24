/* write a program which accept one number from user and print that number of even number on screen
Input : 7
Output : 2 4 6 8 10 12 14 */
//////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Numbers {
    public void Even_Numbers(int iNum) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNum; iCnt++) {
            System.out.print(2 * iCnt + "\t");
        }
    }
}

public class program8 {
    public static void main(String[] args) {
        int iNo = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Numbers Nobj = new Numbers();
        Nobj.Even_Numbers(iNo);
    }
}
