/*Accept division of student from user and depends on the division display exam timing . 
there are 4 divisions in school as A,B,C,D. Exam of division A at 7 AM, B at 8.30 AM, 
C at 9.20 AM and D at 10.30 AM.(Application should be case insensitive)

Input: C
Output: Your exam at 9.20 AM

Input: d
Output: Your exam at 10.30 AM
*/
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XCharacter {
    public void DisplaySchedule(char chDiv) {
       switch(chDiv)
       {
            case 'A':
            case 'a': 
                        System.out.println("Your exam at 7 AM");
                        break;
            case 'B':
            case 'b': 
                        System.out.println("Your exam at 8.30 AM");
                        break;
            case 'C':
            case 'c': 
                        System.out.println("Your exam at 9.20 AM");
                        break;
            case 'D':
            case 'd': 
                        System.out.println("Your exam at 10.30 AM");
                        break;
       }

    }
}

public class program101 {
    public static void main(String[] args) {
        char cValue = '\0';
        boolean bRet = false;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter your division : ");
        cValue = Sobj.next().charAt(0);

        XCharacter Cobj = new XCharacter();
        Cobj.DisplaySchedule(cValue);
    }
}
