/* Accept character from user and display its ASCII value in decimal, octal and hexadecimal format.

Input: A
Output: Decimal      65
        Octal        0101
        Hexadecimal  0X41
        
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
   public void Display(char Ch) {
      int iNo = Ch, iNo1 = Ch, iNo2 = Ch;
      
      if((Ch >= 'A') && (Ch <= 'Z') || (Ch >= 'a') && (Ch <= 'z'))
      {
         System.out.printf("Decimal\t %d \nOctal\t 0%o \nHexadecimal\t 0X%x\n",iNo,iNo1,iNo2);
      }  
      else
      {
         System.out.printf("%c It is not Special Symbol",Ch);
      }    
   }
}

public class program106 {
   public static void main(String[] args) {
      char CValue = '\0';
        XCharacter Cobj = new XCharacter();

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        CValue = Sobj.next().charAt(0);

        Cobj.Display(CValue);
   }
}
