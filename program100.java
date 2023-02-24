/*Accept Character from user and check whether it is Small or not (a-z).
Input: g
Output: TRUE

Input: D
Output: FALSE
*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
    public boolean ChkSmall(char Ch) {
        if (Ch >= 'a' && Ch <= 'z') {
            return true;
        } else {
            return false;
        }
    }
}

public class program100 {
    public static void main(String[] args) {
        char cValue = '\0';
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = Sobj.next().charAt(0);

        XCharacter Cobj = new XCharacter();
        bRet = Cobj.ChkSmall(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" it is Small character");
        }
        else
        {
            System.out.println(cValue+" it is not Small character");
        }
    }
}
