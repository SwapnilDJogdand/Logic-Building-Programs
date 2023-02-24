/*
write a recursive program which accept number from user and return its factorial.
Input: 5   
Output:  120
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Numbers{
   public static int Factorial(int iNo)
   {  
       if(iNo == 1)
       {
           return 1;
       }
       else
       {
            return(iNo * Factorial(iNo-1));
       }
   }
}
public class program160
{
   public static void main(String[] args) {
      int iNum = 0, iRet = 0;
      iNum = 5;  

      Numbers Nobjx = new Numbers();
      iRet = Nobjx.Factorial(iNum);
      
      System.out.println("Factorial is : "+ iRet);
   }
}

