/*
write a recursive program which accept number from user and return Smallest digits.
Input: 87983 
Output:  3
*/
/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Numbers{
   public static int MinDigit(int iNo)
   {  
        int iMin = 0;
        
        if(iNo < 10)
        {
            return iNo;
        }
        else
        {
            return Math.min(iNo%10, MinDigit(iNo/10));
        }
   }
}

public class program165
{
   public static void main(String[] args) {
      int iNum = 0, iRet = 0;
      
      Scanner Sobj = new Scanner(System.in);
      System.out.println("Enter Number : ");
      iNum = Sobj.nextInt();
      
      Numbers Nobjx = new Numbers();
      iRet = Nobjx.MinDigit(iNum);
      
      System.out.println("Smallest Number is : "+ iRet);
   }
}
