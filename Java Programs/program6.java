/*  Accept the number from user and display first number in second number of times.
 Input: 12  5
 Output: 12  12  12  12  12

 Input: -2  3
 Output:-2  -2  -2

 Input: 21   -3
 Output: 21 21 21    */
///////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Accept {
    public void Display(int iNo, int iFreq) {
        int iCnt = 0;
        if (iFreq < 0) {
            iFreq = -iFreq;
        } else if (iFreq == 0) {
            System.out.println("Plz enter Greater than zero values");
        }

        for (iCnt = 0; iCnt < iFreq; iCnt++) {
            System.out.print(iNo + "\t");
        }
    }
}

public class program6 {
    public static void main(String[] args) {
        int iValue = 0, iFrequancy = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        iValue = Sobj.nextInt();

        System.out.print("Enter Frequancy : ");
        iFrequancy = Sobj.nextInt();

        Accept Aobj = new Accept();
        Aobj.Display(iValue, iFrequancy);
    }
}
