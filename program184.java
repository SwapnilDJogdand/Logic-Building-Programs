// write java program to accept directory name from user and create that directory. 
////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.lang.*;
import java.util.*;

class FileX{
    public void CreateDirectory(String Str)
    {
        File file = new File(Str);
        
        boolean bool = file.mkdir();
        if(bool)
        {
            System.out.println("Folder is created successfully");
        }
        else
        {
            System.out.println("Folder is not created because error found...");
        }
    }
}

public class program184 {
    public static void main(String[] args) {
        String SPath = null;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the path where you want to create folder : ");
        SPath = Sobj.nextLine();

        System.out.println("Enter the name of the desired directory : ");
        SPath = SPath + Sobj.next();
        FileX Fobj = new FileX();
        Fobj.CreateDirectory(SPath);
    }
}



