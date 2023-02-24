/* Accept one character from user and convert case of that character.
   Input: a   Output: A
   Input:D    Output: d
*/
/////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class ConvertCase {
    public void DisplayConvert(char CValue) {
        if (CValue >= 'a' && CValue <= 'z') {
            System.out.println((char) (CValue - 32) + " Value is Uppercase");
        } else if (CValue >= 'A' && CValue <= 'Z') {
            System.out.println((char) (CValue + 32) + " Value is Lowercase");
        }
    }
}

public class program10 {
    public static void main(String[] args) {
        char cValue = '\0';

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Character : ");
        cValue = Sobj.next().charAt(0);

        ConvertCase Cobj = new ConvertCase();
        Cobj.DisplayConvert(cValue);
    }
}
