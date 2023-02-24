/* Accept character from user. if it is capital then display all the characters from the input character till Z. 
if input character is small then print all the characters in reverse order till a. in other cases return directly.

Input: Q
Output: Q R S T U V W X Y Z

Input: m 
Output: m l k j i h g f e d c b a

Input: 8
Output:  

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
    public void Display(char ch) {
        char i = '\0';

        if (ch >= 'A' && ch <= 'Z') {
            for (i = ch; i <= 'Z'; i++) {
                System.out.printf("%c\t", i);
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            for(i = ch; i >= 'a'; i--)
            {
                System.out.printf("%c\t", i);
            }
        }
        else
        {
            System.out.println("Invalid Character");
        }
    }
}

public class program104 {
    public static void main(String[] args) {
        char CValue = '\0';
        XCharacter Cobj = new XCharacter();

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        CValue = Sobj.next().charAt(0);

        Cobj.Display(CValue);
    }
}
