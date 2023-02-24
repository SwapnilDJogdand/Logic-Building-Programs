/* write a recursive program which display below pattern.
Output: *	*	*	*	*
*/
//////////////////////////////////////////////////////////////

import java.lang.*;
import java.lang.Thread.State;
import java.util.*;

class Pattern{
   public void Display(int iCnt)
   {
      if(iCnt > 0)
      {
         Display(iCnt-1);
         System.out.printf("*\t");
      }
   }
}
public class program152
{
   public static void main(String[] args) {
      int iNum = 5;
      Pattern pobj = new Pattern();
      pobj.Display(iNum);
   }
}
