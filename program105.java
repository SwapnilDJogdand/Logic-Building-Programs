/* Accept character from user and check whether it is special symobol or not(!,@,#,$,%,^,&,*).

Input: %
Output: True

Input: d 
Output: False

*/
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
   public void Display(char Ch) {
      if((Ch == '!') || (Ch == '@') || (Ch == '#') || (Ch == '$') || (Ch == '%') || (Ch == '^') || (Ch == '&') || Ch == '*')
      {
         System.out.printf("%c It is Special Symbol",Ch);
      }  
      else
      {
         System.out.printf("%c It is not Special Symbol",Ch);
      }    
   }
}

public class program105 {
   public static void main(String[] args) {
      char CValue = '\0';
        XCharacter Cobj = new XCharacter();

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        CValue = Sobj.next().charAt(0);

        Cobj.Display(CValue);
   }
}
