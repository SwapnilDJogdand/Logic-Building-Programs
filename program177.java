// write java program to accept file name from user and open that file.
////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.*;
import java.util.*;

class FileX {
    public void OpenFile(String SName)
    {
        try
        {
            File file = new File(SName);
            Scanner Sc = new Scanner(file);
            System.out.println("The file content is : ");
            if(Sc.hasNextLine())
            {
                System.out.println("File Succsefully open.");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Unable to open file.");
        }
    }
}

public class program177 {
    public static void main(String[] args) {
        String Str = null;

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        Str = Sobj.nextLine();

        Fobj.OpenFile(Str);
    }
}




