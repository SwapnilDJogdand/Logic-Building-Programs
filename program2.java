// Program to print 5 times "Name" on screen.

import java.lang.*;
import java.util.*;

class Display {
    public void Display_Name(String sName) {
        for (int iCnt = 1; iCnt <= 5; iCnt++) {
            System.out.println(iCnt + " : " + sName);
        }
    }
}

class program2 {
    public static void main(String[] args) {
        String SName = "\0";

        Scanner Sobj = new Scanner(System.in);

        System.out.print("Enter Name : ");
        SName = Sobj.nextLine();

        Display Dobj = new Display();
        Dobj.Display_Name(SName);
    }
}
