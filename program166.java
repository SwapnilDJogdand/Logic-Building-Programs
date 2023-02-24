/*
write a recursive program which accept number from user and return its reverse number.
Input: 523   
Output:  325
*/
/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Numbers{
   public static void ReverseDigit(int iNo)
   {  
        if(iNo < 10)
        {
            System.out.println(iNo);
            return;
        }
        else
        {
            System.out.print(iNo % 10);
            ReverseDigit(iNo/10);
        }
   }
}

public class program166
{
   public static void main(String[] args) {
      int iNum = 0;
      
      Scanner Sobj = new Scanner(System.in);
      System.out.println("Enter Number : ");
      iNum = Sobj.nextInt();
      
      Numbers Nobjx = new Numbers();
      System.out.println("Reversed Number is : ");
      Nobjx.ReverseDigit(iNum);
   }
}
