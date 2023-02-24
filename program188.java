/* write java program to accept directory name from user and write names of all files from that directory into one newly created
   file named as "Marvellous.txt". */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.*;
import java.nio.Buffer;
import java.util.*;

class FileX
{
    public void FileM(String SName)
    {
        try
        {
            File DirectoryPath = new File(SName);
            File flist[] = DirectoryPath.listFiles();
            
            File fobj = new File("Marvellous.txt");
            boolean bobj = fobj.createNewFile();
            FileOutputStream Writeobj = new FileOutputStream(fobj);

            FileInputStream ReaderObj = null;
            int ret = 0;
            byte buffer[] = new byte[100];

            for(int i = 0; i < flist.length; i++)
            {
                String name = flist[i].getName();
                if(name.endsWith(".txt"))
                {
                    ReaderObj = new FileInputStream(flist[i]);
                    while((ret = ReaderObj.read(buffer)) != -1)
                    {
                        Writeobj.write(buffer,0,ret);
                    }
                    ReaderObj.close();
                }
            }
        }
        catch(Exception eobj)
        {
            eobj.printStackTrace();
        }
    }
}

public class program188 {
    public static void main(String[] args) {
          String SPath = null;
          
          Scanner Sobj = new Scanner(System.in);
          System.out.println("Enter folder name : ");
          SPath = Sobj.nextLine();


          FileX fobj = new FileX();
          fobj.FileM(SPath);
    }
}


