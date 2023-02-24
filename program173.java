/* write application which accept file name from user and count number of small character from that file.
Input:   Demo.txt
		
Output:  Number of Small Characters are 21 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;

class FileX {
    public void CountSmall(String SName)
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
                    if(StrLine.charAt(i) >= 'a' && StrLine.charAt(i) <= 'z')
                    {
                        iCnt++;
                    }
                }
                System.out.println("Small of Capital letters are : "+ iCnt);
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

public class program173 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.CountSmall(Str);
    }
}


