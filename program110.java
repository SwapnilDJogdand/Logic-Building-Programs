/*
      Write a program which accept string from user and check whether it contains vowels in it or not. (a,e, i, o, u)
	  
      Input : MarvellouS
      Output : TRUE
	  
	  Input : "Demo"
	  Output : TRUE
	  
	  Input : "xyz"
	  Output : FALSE

*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class XString
{
    public boolean ChkVowel(String Str)
    {
        char Ch = '\0';

        for(int i = 0; i < Str.length(); i++)
        {
            Ch = Str.charAt(i);
            if(Ch == 'a' || Ch == 'e'|| Ch == 'i'|| Ch == 'o' || Ch == 'u' || Ch == 'A' || Ch == 'E' || Ch == 'I' || Ch == 'O'|| Ch == 'U')
            {
                return true;
            }
        }    
        return false;  
    }
}

public class program110 {
    public static void main(String[] args) {
        String SName = null;

        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        SName = Sobj.nextLine();

        XString XSobj = new XString();
        
        boolean bRet = false;

        bRet = XSobj.ChkVowel(SName);

        if(bRet == true)
        {
            System.out.println("It is vowel");
        }
        else
        {
            System.out.println("It is not vowel");
        }
    }
}

