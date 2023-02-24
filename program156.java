/* write a recursive program which display below pattern.
Output: a	b	c	d	e	f
*/
//////////////////////////////////////////////////////////////

import java.lang.*;

class Pattern{
   public static void Display(char Ch)
   {
      if(Ch <= 'f')
      {
         System.out.printf("%c\t",Ch);
         Ch++;
         Display(Ch);
      }
   }
}
public class program156
{
   public static void main(String[] args) {
      char ch = 'a';
      Pattern pobj = new Pattern();
      pobj.Display(ch);
   }
}
