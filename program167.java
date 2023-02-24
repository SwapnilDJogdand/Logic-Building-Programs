/* write application which accept file name from user and open that file in read mode.
Input:   Demo.txt
Output:  File Open Succsefully.  */
//////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.*;

class FileX {
    public void DisplayData(String SName)
    {
        try
        {
            File Fobj = new File(SName);
            Scanner SReader = new Scanner(Fobj);

            while(SReader.hasNextLine())
            {
                System.out.println("File Open Succsefully.");
                System.out.println("Contents of file : ");
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

public class program167 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.DisplayData(Str);
    }
}
