/* write a program which accept number from user return multiplication of all digit.
Input: 2395
Output: 270
*/
/////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits
{
    public int Multi_Digits(int iNo)
    {
        int iDigit = 0, iMult = 1;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iMult *= iDigit;
            iNo /= 10;
        }
        return iMult;
    }
}

public class program25 {
    public static void main(String[] args) {
        int iNum = 0;
        int iRet = 0;

        Scanner Sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        iNum = Sobj.nextInt();

        Digits Dobj = new Digits();        
        iRet = Dobj.Multi_Digits(iNum);

        System.out.println("Multiplication of all digit is : "+iRet);
    }
}
