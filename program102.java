/* Write a program which display ASCII table.Table contains symbol, Decimal, Heaxadecimal and 
Octal representation of every member form 0 to 255. 
*/
///////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class XCharacter
{
    public void Display_ASCII()
    {
        int iCnt = 0;
        System.out.println("************ASCII Table 0 to 255***************");

        for(iCnt = 0; iCnt < 255; iCnt++)
        {
            System.out.printf("Symbol => %c /t Decimal => %d \t Heaxadecimal => %x \t Octal => %o ",iCnt,iCnt,iCnt,iCnt);
        }
    }
}

public class program102 {
    public static void main(String[] args) {
        XCharacter Cobj = new XCharacter();
        Cobj.Display_ASCII();
    }
}
