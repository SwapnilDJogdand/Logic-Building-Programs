/* write application which accept file name from user and read all data from that file and display content on screen.
Input:   Demo.txt
Output:  Display all data of file.  */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.*;

class FileX {
    public void DisplayFileData(String SName)
    {
        try
        {
            File Fobj = new File(SName);
            Scanner SReader = new Scanner(Fobj);
            System.out.println("Contents of files : ");
            while(SReader.hasNextLine())
            {
                System.out.println(SReader.nextLine());
            }
            SReader.close();
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured : ");
            eobj.printStackTrace();
        }
    }
}

public class program169 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.DisplayFileData(Str);
    }
}

