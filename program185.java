// write java program to accept directory name from user and create that directory. 
////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileInputStream;
import java.lang.*;
import java.security.MessageDigest;
import java.util.*;

class FileX{
    public void CalculateCheckSum(String Str)
    {
        try
        {
            String FilePath = Str;
            
            MessageDigest MD = MessageDigest.getInstance("SHA1");

            FileInputStream fileinput = new FileInputStream(FilePath);
            byte[] databytes = new byte[1024];

            int ByteRead = 0;

            while((ByteRead = fileinput.read(databytes)) != -1)
            {
                MD.update(databytes, 0, ByteRead);
            }

            byte[] digestByte = MD.digest();

            StringBuffer Sb = new StringBuffer("");

            for(int i = 0; i < digestByte.length; i++)
            {
                Sb.append(Integer.toString((digestByte[i] & 0xff) + 0x100, 16).substring(1));
            }
            System.out.println("Checksum for the file : "+Sb.toString());

            fileinput.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Error Occured.");
            eobj.printStackTrace();
        }
    }
}

public class program185 {
    public static void main(String[] args) {
        String SPath = null;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the path : ");
        SPath = Sobj.nextLine();

        FileX Fobj = new FileX();
        Fobj.CalculateCheckSum(SPath);
    }
}



