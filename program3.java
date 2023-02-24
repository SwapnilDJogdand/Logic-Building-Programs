// program to print 5 to 1 numbers on screen

import java.lang.*;
import java.util.*;

class Numbers {
    public int iNo;

    Numbers(int i) {
        this.iNo = i;
    }

    void Display_Rev_Num() {
        for (int iCnt = iNo; iCnt > 0; iCnt--) {
            System.out.println(iCnt);
        }
    }
}

class program3 {
    public static void main(String[] args) {
        int iNum = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        iNum = Sobj.nextInt();

        Numbers Nobj = new Numbers(iNum);

        Nobj.Display_Rev_Num();
    }
}
