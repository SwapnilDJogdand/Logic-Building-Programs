/*
write a recursive program which accept string from user and count number of characters.
Input: Hello
Output:  5
*/
////////////////////////////////////////////////////////////

import java.lang.*;

class StringsX{
   public static int StrLen(String StrX)
   {
      if(StrX.equals(""))
      {
        return 0;
      }
      else
      {
        return StrLen(StrX.substring(1)) + 1;
      }
   }
}
public class program159
{
   public static void main(String[] args) {
      String Str = "Hello";
      int iRet = 0;

      StringsX Sobjx = new StringsX();
      iRet = Sobjx.StrLen(Str);

      System.out.println("String Count is : "+ iRet);
   }
}

