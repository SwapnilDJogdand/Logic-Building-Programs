/* write application which accept file name from user and create that file.
Input:   Demo.txt
Output:  File Created Succsefully.  */
//////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.*;

class FileX {
    public void CreateFileX(String SName)
    {
        try
        {
            File Fobj = new File(SName);

            if(Fobj.createNewFile())
            {
                System.out.println("File created succsefully : "+Fobj.getName());
            }
            else
            {
                System.out.println("File already exist.");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured : ");
            eobj.printStackTrace();
        }
    }
}

public class program168 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name to create that file : ");
        
        Str = Sobj.nextLine();

        Fobj.CreateFileX(Str);
    }
}
