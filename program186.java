// write java program to accept diretory name from user and display all names of files from that directory and size of each file on screen.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.io.File;
import java.io.FileInputStream;
import java.lang.*;
import java.security.MessageDigest;
import java.util.*;

class FileX{
    public void DirectDisplaySIze(String Str)
    {
        try
        {
            File DirectoryPath = new File(Str);

            File fileList[] = DirectoryPath.listFiles();
            System.out.println("List of files in directory : ");
            
            for(File file : fileList)
            {
                System.out.println("File Name : "+ file.getName());
                System.out.println("File Size : "+file.getTotalSpace());
                System.out.println(" ");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Error Occured.");
            eobj.printStackTrace();
        }
    }
}

public class program186 {
    public static void main(String[] args) {
        String SPath = null;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter folder name : ");
        SPath = Sobj.nextLine();

        FileX Fobj = new FileX();
        Fobj.DirectDisplaySIze(SPath);
    }
}



