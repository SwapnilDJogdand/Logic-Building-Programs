// write java program to accept file name from user and check whether that file is regular or not. 
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.lang.*;
import java.util.*;

class FileX{
    public void Regx(String Str)
    {
        File file = new File(Str);
        System.out.println(file.isFile());
    }
}
public class program183 {
    public static void main(String[] args) {
        String SName = null;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter file name to check in directory : ");
        SName = Sobj.nextLine();

        FileX Fobj = new FileX();
        Fobj.Regx(SName);
    }
}
