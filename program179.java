// write java program to accept file name from user and open that file in write mode and write some data at the end of file.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;

class FileX {
    public void WriteFile(String SName)
    {
        try
        {
            String Str1 = null;

            FileWriter FWrite = new FileWriter(SName,true);

            Scanner Sobj = new Scanner(System.in);
            System.out.println("Enter data : ");
            Str1 = Sobj.nextLine();

            FWrite.write(Str1);
            FWrite.close();
            System.out.println("Succsefully wrote the data.");
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured.");
            eobj.printStackTrace();
        }
    }
}

public class program179 {
    public static void main(String[] args) {
        String Str = null, Str1 = null;

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        Str = Sobj.nextLine();

        Fobj.WriteFile(Str);
    }
}




