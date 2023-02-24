/* write java program to accept two file names from user and open first file and create new file(second name)
and copy the data 
first file into newly created file. */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;  
import java.util.*;

class FileX
{
    public void CopyFiletoFile(String Src, String Dest)throws Exception
    {  
        FileReader fin = new FileReader(Src);  
        FileWriter fout = new FileWriter(Dest, true);  
        int c;  
        while ((c = fin.read()) != -1) {  
         fout.write(c);  
        }  
        System.out.println("Copy finish...");  
        fin.close();  
        fout.close();  
    }
}

class program182 {  
 public static void main(String arg[])throws Exception {  
    FileX Fobj = new FileX();
  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter File Name :");  
    String SourceF = sc.next();  
    System.out.print("Enter File Name :");  
    String DestinationF = sc.next();

    Fobj.CopyFiletoFile(SourceF,DestinationF);
 }  
}   
