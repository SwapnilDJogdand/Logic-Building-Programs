/* write application which accept file name from user and count number of White Spaces from that file.
Input:   Demo.txt
		
Output:  Number of White Spaces are 13 */
//////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;

class FileX {
    public void CountWhiteSpace(String SName)
    {
        try
        {
            int iCnt = 0;
            String StrLine = null;
            char CountChar = '\0';

            BufferedReader Br = new BufferedReader(new FileReader(SName));

            while((StrLine = Br.readLine()) != null)
            {
                for(int i = 0; i < StrLine.length(); i++)
                {
                    if(StrLine.charAt(i) == ' ')
                    {
                        iCnt++;
                    }
                }
            }
            System.out.println(iCnt);
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured : ");
            eobj.printStackTrace();
        }
    }
}

public class program174 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.CountWhiteSpace(Str);
    }
}



