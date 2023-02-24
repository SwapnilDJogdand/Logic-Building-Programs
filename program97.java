/*Accept Character from user and check whether it is alphabet or not (A-Z a-z).
Input: F
Output: TRUE

Input: &
Output: FALSE
*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
    public boolean ChkAlphabet(char Ch) {
        if ((Ch >= 65 && Ch <= 90) || (Ch >= 97 && Ch <= 122)) {
            return true;
        } else {
            return false;
        }
    }
}

public class program97 {
    public static void main(String[] args) {
        char cValue = '\0';
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = Sobj.next().charAt(0);

        XCharacter Cobj = new XCharacter();
        bRet = Cobj.ChkAlphabet(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" it is alphabet");
        }
        else
        {
            System.out.println(cValue+" it is not alphabet");
        }
    }
}
