/* write a recursive program which display below pattern.
Output: 5	4	3	2	1
*/
//////////////////////////////////////////////////////////////

import java.lang.*;

class Pattern{
   public void Display(int iCnt)
   {
      if(iCnt > 0)
      {
         System.out.printf("%d\t",iCnt);
         Display(iCnt-1);
      }
   }
}
public class program154
{
   public static void main(String[] args) {
      int iNum = 5;
      Pattern pobj = new Pattern();
      pobj.Display(iNum);
   }
}
