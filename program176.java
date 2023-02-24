/* write application which accept file name from user and one Count from user and read that number of characters from starting position.
Input:   Demo.txt	  12
		
Output:  Display first 12 characters from Demo.txt */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.*;
import java.util.*;

class FileX {
    public void DisplayN(String SName, int iNo)
    {
        try
        {
            File Fobj = new File(SName);
            Scanner SReader = new Scanner(Fobj);
            String Str = SReader.nextLine();

            System.out.println(Str.substring(0,iNo));
        }
        catch(Exception eobj)
        {
            System.out.println("An error occured : ");
            eobj.printStackTrace();
        }
    }
}

public class program176 {
    public static void main(String[] args) {
        String Str = "";
        int iNumber = 0;

        FileX Fobj = new FileX();

        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        Str = Sobj.nextLine();

        System.out.println("Enter Number : ");
        iNumber = Sobj.nextInt();

        Fobj.DisplayN(Str,iNumber);
    }
}



