/*
write a recursive program which accept number from user and return its prodeuct of digits.
Input: 523   
Output:  30
*/
/////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Numbers{
   public static int Product(int iNo)
   {  
        int iProd = 1;

        if(iNo == 0)
        {
            return 1;
        }
        else
        {
            return (iNo % 10) * Product(iNo/10);
        }
   }
}
public class program161
{
   public static void main(String[] args) {
      int iNum = 0, iRet = 0;
      iNum = 523;  

      Numbers Nobjx = new Numbers();
      iRet = Nobjx.Product(iNum);
      
      System.out.println("Product is : "+ iRet);
   }
}
