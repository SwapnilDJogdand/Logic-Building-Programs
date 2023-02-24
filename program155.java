/* write a recursive program which display below pattern.
Output: A	B	C	D	E	F
*/
//////////////////////////////////////////////////////////////

import java.lang.*;

class Pattern{
   public static void Display(char Ch)
   {
      if(Ch <= 'F')
      {
         System.out.printf("%c\t",Ch);
         Ch++;
         Display(Ch);
      }
   }
}
public class program155
{
   public static void main(String[] args) {
      char ch = 'A';
      Pattern pobj = new Pattern();
      pobj.Display(ch);
   }
}
