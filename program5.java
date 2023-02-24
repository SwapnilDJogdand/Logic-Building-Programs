//Accept one number from user and print that number of * on screen

import java.lang.*;
import java.util.*;

class Accept {
    public void Display(int iNo) {
        int iCnt = 0;
        for (iCnt = 0; iCnt < iNo; iCnt++) {
            System.out.print(" * ");
        }
    }
}

public class program5 {
    public static void main(String[] args) {
        int iValue = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = Sobj.nextInt();

        Accept Aobj = new Accept();
        Aobj.Display(iValue);
    }
}
