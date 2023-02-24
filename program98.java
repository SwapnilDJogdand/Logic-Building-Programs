/*Accept Character from user and check whether it is Capital or not (A-Z).
Input: F
Output: TRUE

Input: d
Output: FALSE
*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
    public boolean ChkCapital(char Ch) {
        if (Ch >= 'A' && Ch <= 'Z') {
            return true;
        } else {
            return false;
        }
    }
}

public class program98 {
    public static void main(String[] args) {
        char cValue = '\0';
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = Sobj.next().charAt(0);

        XCharacter Cobj = new XCharacter();
        bRet = Cobj.ChkCapital(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" it is Capital character");
        }
        else
        {
            System.out.println(cValue+" it is not capital character");
        }
    }
}
