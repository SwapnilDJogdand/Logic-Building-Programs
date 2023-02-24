/* write application which accept file name from user and one character from user and count number of occurance of that characters 
from that file.

Input:   Demo.txt    'M'
		
Output:  Frequancy of M is 7 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
import java.util.*;

class FileX {
    public void CountChar(String SName) throws IOException
    {
        String StrLine = null;
        char Ch = '\0';
        int iCnt = 0;
        BufferedReader BRObj = null;
        try
        {
            FileReader FReaderObj = new FileReader(SName);
            BRObj = new BufferedReader(FReaderObj);

            Scanner Sobj = new Scanner(System.in);
            System.out.println("Enter the character : ");
            String StrSearch = Sobj.next();

            while((StrLine = BRObj.readLine()) != null)
            {
                String Str[] = StrLine.split("");
                for(String Strword : Str)
                {
                    if(Strword.equals(StrSearch))
                    {
                        iCnt++;
                    }
                }
            }
            if(iCnt != 0)
            {
                System.out.println("Number of words present in file : "+iCnt);
            }
            else{
                System.out.println("The given character is not present");
            }
        }
        catch(Exception Eobj)
        {
            Eobj.printStackTrace();
        }
        finally
        {
            BRObj.close();
        }
    }
}

public class program175 {
    public static void main(String[] args)throws Exception {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.CountChar(Str);
    }
}



