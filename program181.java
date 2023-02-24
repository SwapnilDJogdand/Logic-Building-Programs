// write java program to accept directory name from user and display all names of files from that directory.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;

class FileX {
    public void List(String SName)
    {
        try
        {
            File FDict = new File(SName);
            File FileList[] = FDict.listFiles();
            System.out.println("List of files in specified directory : ");

            for(File file : FileList)
            {
                System.out.println("File name : "+file.getName());
                System.out.println(" ");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured.");
            eobj.printStackTrace();
        }
    }
}

public class program181 {
    public static void main(String[] args) {
        String Str = null, Str1 = null;

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter folder name : ");
        Str = Sobj.nextLine();

        Fobj.List(Str);
    }
}




