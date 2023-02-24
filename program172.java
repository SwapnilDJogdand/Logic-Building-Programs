/* write application which accept file name from user and count number of capital character from that file.
Input:   Demo.txt
		
Output:  Number of Capital Characters are 23 */
//////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;

class FileX {
    public void CountCapital(String SName)
    {
        Scanner SReader = null;
        try
        {
            int iCnt = 0;
            File FObjfile = new File(SName);
            SReader = new Scanner(FObjfile);

            while(SReader.hasNextLine())
            {
                String StrLine = SReader.nextLine();
                for(int i = 0; i < StrLine.length(); i++)
                {
                    if(StrLine.charAt(i) >= 'A' && StrLine.charAt(i) <= 'Z')
                    {
                        iCnt++;
                    }
                }
                System.out.println("Count of Capital letters are : "+ iCnt);
            }
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured : ");
            eobj.printStackTrace();
        }
        finally
        {
            SReader.close();
        }
    }
}

public class program172 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.CountCapital(Str);
    }
}


