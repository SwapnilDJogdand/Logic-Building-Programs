/*
write a recursive program which accept number from user and display below pattern.
Input: 5
Output: 5	*	4	*	3	*	2	*	1	*
*/
///////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Pattern{
   public void Display(int iCnt)
   {
      if(iCnt > 0)
      {
         System.out.printf("%d\t*\t",iCnt);
         Display(iCnt-1);
      }
   }
}
public class program157
{
   public static void main(String[] args) {
      int iNum = 5;
      Pattern pobj = new Pattern();
      pobj.Display(iNum);
   }
}

