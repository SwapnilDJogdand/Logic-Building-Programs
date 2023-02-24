// write java program to accept directory name from user and display all names of files 
// from that directory which are regular file. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.lang.*;
import java.util.*;

class FileX
{
    public void DisplayFile(String SName)
    {
        try
        {
            File DirectoryPath = new File(SName);
            File flist[] = DirectoryPath.listFiles();
            System.out.println("List of file in directory : ");

            for(File file : flist)
            {
                System.out.println("File Name : "+file.getName());
            }
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}

public class program187 {
    public static void main(String[] args) {
          String SPath = null;
          
          Scanner Sobj = new Scanner(System.in);
          System.out.println("Enter folder name : ");
          SPath = Sobj.nextLine();

          FileX fobj = new FileX();
          fobj.DisplayFile(SPath);
    }
}
