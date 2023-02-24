/* Accept character from user. if character is small display its corresponding capital character. 
and if it is capital then display its corresponding small. In other cases display as it is.

Input: Q
Output: q

Input: m
Output: M

Input: 4
Output: 4

*/
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter
{
    public void Display(char Ch)
    {
        if(Ch >= 'A' && Ch <= 'Z')
        {
            Ch = (char) (Ch + 32);
            System.out.println("Small Character is : "+Ch);
        }
        else if(Ch >= 'a' && Ch <= 'z')
        {
            Ch = (char) (Ch - 32);
            System.out.println("Capital Character is : "+Ch);
        }
        else 
        {
            System.out.println(Ch);
        }
    }
}

public class program103 {
    public static void main(String[] args) {
        char CValue = '\0';
        XCharacter Cobj = new XCharacter();
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        CValue = Sobj.next().charAt(0);
      
        Cobj.Display(CValue);
    }
}
