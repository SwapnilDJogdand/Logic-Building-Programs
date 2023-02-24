/*
write a recursive program which accept number from user and return largest digits.
Input: 87983 
Output:  9
*/
/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Numbers{
   public static int MaxDigit(int iNo)
   {  
        int iMax = 0;
        
        if(iNo == 0)
        {
            return 0;
        }
        else
        {
            return Math.max(iNo%10, MaxDigit(iNo/10));
        }
   }
}

public class program163
{
   public static void main(String[] args) {
      int iNum = 0, iRet = 0;
      
      Scanner Sobj = new Scanner(System.in);
      System.out.println("Enter Number : ");
      iNum = Sobj.nextInt();
      
      Numbers Nobjx = new Numbers();
      iRet = Nobjx.MaxDigit(iNum);
      
      System.out.println("Largest Number is : "+ iRet);
   }
}
