/*
write a recursive program which accept number from user and return summation of its digits.
Input: 879
Output:  24
*/
////////////////////////////////////////////////////////////

import java.lang.*;

class Digits{
   public int SumDigit(int iNo)
   {
      int idigit = 0;
      if(iNo != 0)
      {
        return(iNo % 10 + SumDigit(iNo/10)); 
      } 
      else
      {
        return 0;
      }
   }
}
public class program158
{
   public static void main(String[] args) {
      int iNum = 879, iRet = 0;

      Digits Dobj = new Digits();
      iRet = Dobj.SumDigit(iNum);

      System.out.println("Digit Sum is : "+ iRet);
   }
}

