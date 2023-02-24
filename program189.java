/* write java program to accept directory name from user and write names of all files from that directory into one newly created
   file named as "Marvellous.txt". */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.io.File;
import java.util.Date;
import java.util.*;
import java.io.IOException; 
import java.io.*;  

class Directory
{
	public void File()
	{
		 try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Please direcory / folder name");
            String foldername= sobj.nextLine();

            File dobj = new File(foldername);

            File allfiles[] = dobj.listFiles();
            String name;

            File fobj=new File("Marvellous.txt");
            boolean bobj = fobj.createNewFile();
            FileOutputStream writerobj = new FileOutputStream(fobj);

            FileInputStream readerobj = null;
            int ret = 0;
            byte buffer[] = new byte[100];

            for(int i = 0; i < allfiles.length; i++)
            {
                    name = allfiles[i].getName();
                    
                    if(name.endsWith(".txt"))
                    {
                        readerobj = new FileInputStream(allfiles[i]);

                        while((ret = readerobj.read(buffer)) != -1)
                        {
                                writerobj.write(buffer,0,ret);
                        }
                        readerobj.close();
                    }
            }
        }
        catch(Exception obj)
        {

        }
	}
}

public class program2 
{
     public static void main(String a[])
     {
		Directory dobj = new Directory();
		dobj.File();
     }
}