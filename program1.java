// Program to divide two numbers

import java.lang.*;
import java.util.*;

class Numbers {
    public int iNum1, iNum2;

    public Numbers(int i, int j) {
        this.iNum1 = i;
        this.iNum2 = j;
    }

    int Divide() {
        if (iNum2 <= 0) {
            return -1;
        }

        int iAns = 0;
        iAns = iNum1 / iNum2;
        return iAns;
    }
}

class program1 {
    public static void main(String[] args) {
        int iNo1 = 0, iNo2 = 0, iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number1 : ");
        iNo1 = Sobj.nextInt();

        System.out.println("Enter Number2 : ");
        iNo2 = Sobj.nextInt();

        Numbers Nobj = new Numbers(iNo1, iNo2);

        iRet = Nobj.Divide();

        if (iRet == -1) {
            System.out.println("Plz Enter Greater Than 0 Values...");
        }
        System.out.println("Division is : " + iRet);
    }
}