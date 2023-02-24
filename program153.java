/* write a recursive program which display below pattern.
Output: 1	2	3	4	5
*/
//////////////////////////////////////////////////////////////

import java.lang.*;

class Pattern{
   public void Display(int iCnt)
   {
      if(iCnt > 0)
      {
         Display(iCnt-1);
         System.out.printf("%d\t",iCnt);
      }
   }
}
public class program153
{
   public static void main(String[] args) {
      int iNum = 5;
      Pattern pobj = new Pattern();
      pobj.Display(iNum);
   }
}
