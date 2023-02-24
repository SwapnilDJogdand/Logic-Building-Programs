/*Accept N number from user and return differecnce between summation of even elements and sumation of odd elements.
Input:   N :       6
         Elements: 85 66 3 80 93 88
Output:  53  (234-181)
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Differecnce {
    public int iArray[];

    public Differecnce(int iNo) {
        iArray = new int[iNo];
    }

    public void Accept() {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Elements : ");

        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = Sobj.nextInt();
        }
    }
 
    public int Summation() {
        int iEven = 0, iOdd = 0, iSum = 0;
        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] % 2 == 0) {
                iEven += iArray[i];
            } else {
                iOdd += iArray[i];
            }
        }
        iSum = iEven - iOdd;
        return iSum;
    } 
}

public class program27 {
    public static void main(String[] args) {
        int iNo = 0, iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = Sobj.nextInt();

        Differecnce Dobj = new Differecnce(iNo);
        Dobj.Accept();
        iRet = Dobj.Summation();

        System.out.println("Summation is : "+iRet);
    }
}