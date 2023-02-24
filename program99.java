/*Accept Character from user and check whether it is digit or not (0-9).
Input: 7
Output: TRUE

Input: d
Output: FALSE
*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
    public boolean ChkDigit(char Ch) {
        if (Ch >= 48 && Ch <= 57) {
            return true;
        } else {
            return false;
        }
    }
}

public class program99 {
    public static void main(String[] args) {
        char cValue = '\0';
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter character : ");
        cValue = Sobj.next().charAt(0);

        XCharacter Cobj = new XCharacter();
        bRet = Cobj.ChkDigit(cValue);

        if(bRet == true)
        {
            System.out.println(cValue+" it is Digit");
        }
        else
        {
            System.out.println(cValue+" it is not Digit");
        }
    }
}
