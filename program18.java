/*write a program which accept number from the user and check wheteher it contains 0 in it or not.
Input: 2395
Output: There is no zero

Input: 1018
Output: It contains Zero
*/
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits
{
    public boolean ChkZero(int iNo)
    {
        int iDigit = 0;

        if(iNo == 0)
        {
            return true;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if(iDigit == 0)
            {
                return true;
            }
            iNo /= 10;
        }
        return false;
    }
}

public class program18 {
    public static void main(String[] args) {
        int iNum = 0;
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Digits Dobj = new Digits();        
        bRet = Dobj.ChkZero(iNum);

        if(bRet == true)
        {
            System.out.println("It Contains Zero");
        }
        else
        {
            System.out.println("There is no Zero");
        }
    }
}
