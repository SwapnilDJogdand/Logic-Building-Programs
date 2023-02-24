/*Accept number from user and display bellow pattern
Input: 5
Output: A  B  C  D  E
*/
//////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int i = 0;
        char ch = '\0';

        for(i = 1,ch = 'A'; i <= iNo; i++,ch++)
        {
            System.out.print("\t"+ch);
        }
    }
}

public class program47 {
    public static void main(String[] args) {
        int iNum = 0;
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Pattern Pobj = new Pattern();
        Pobj.Display(iNum);
    }
}
