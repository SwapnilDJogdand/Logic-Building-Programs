/*write a rogram which accept number from user and display its digits in reverse
Input: 2395
Output: 5
        9
		3
		2
*/

/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Digits
{
    public void Display_Rev_Digit(int iNo)
    {
        int iDigit = 0;
        
        for(int iCnt = 1; iNo != 0; iCnt++)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo /= 10;               
        }
    }
}

public class program17 {
    public static void main(String[] args) {
     int iNum = 0;
     
     Scanner Sobj = new Scanner(System.in);

     System.out.println("Enter Number : ");
     iNum = Sobj.nextInt();

     Digits Dobj = new Digits();
     Dobj.Display_Rev_Digit(iNum);

    }
}
