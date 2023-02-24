/* write application which accept file name from user and display size of file.
Input:   Demo.txt
Output:  File size is 56 bytes*/
//////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.*;

class FileX {
    public void DisplayFileSize(String SName)
    {
        File Fobj = new File(SName);
        long LfileSize = Fobj.length();
        System.out.println(LfileSize);
    }
}

public class program170 {
    public static void main(String[] args) {
        String Str = "";

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        
        Str = Sobj.nextLine();

        Fobj.DisplayFileSize(Str);
    }
}

