// write java program to accept file name from user and create new file of that name if it is not existing.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;

class FileX {
    public void CreateFile(String SName)
    {
        try
        {
           File file = new File(SName);
           if(file.createNewFile())
           {
                System.out.println("File has been created.");
           }
           else
           {
                System.out.println("File has already exists.");
           }
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured.");
            eobj.printStackTrace();
        }
    }
}

public class program180 {
    public static void main(String[] args) {
        String Str = null, Str1 = null;

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        Str = Sobj.nextLine();

        Fobj.CreateFile(Str);
    }
}




