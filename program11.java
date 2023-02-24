/* Accept one character from user and check whether that character is vowel(a,e,i,o,u) or not.
  Input: E    Output: TRUE
  Input: d    Output: FALSE
*/
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class checkVowel {
    public boolean chk_Vowel_or_Not(char CValue) {
        if (CValue == 'a' || CValue == 'e' || CValue == 'i' || CValue == 'o' || CValue == 'u' || CValue == 'A'
                || CValue == 'E' || CValue == 'I' || CValue == 'O' || CValue == 'U') {
            return true;
        } else {
            return false;
        }
    }
}

public class program11 {
    public static void main(String[] args) {
        char cValue = '\0';

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter 1 Character : ");
        cValue = Sobj.next().charAt(0);

        checkVowel Cobj = new checkVowel();
        boolean bRet = Cobj.chk_Vowel_or_Not(cValue);

        if (bRet == true) {
            System.out.println("It is Vowel");
        } else {
            System.out.println("It is not Vowel");
        }
    }
}
