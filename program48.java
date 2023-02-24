/*Accept number from user and display bellow pattern
Input: 5
Output: 5	#	4	#	3	#	2	#	1	#
*/
//////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int i = 0;

        for(i = iNo; i >= 1; i--)
        {
            System.out.print(i+"\t"+"#"+"\t");
        }
    }
}

public class program48 {
    public static void main(String[] args) {
        int iNum = 0;
        
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNum = Sobj.nextInt();

        Pattern Pobj = new Pattern();
        Pobj.Display(iNum);
    }
}