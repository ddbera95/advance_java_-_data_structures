package PIngCommand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateIpFile {

    boolean CreateIpList(String Path)
    {
        try(PrintWriter printWriter = new PrintWriter(Path))
        {

            for(int Iterator = 0; Iterator < 256 ; Iterator++ )
            {

                printWriter.write("10.20.40."+Iterator+"\n");

            }

        }
        catch (IOException e)
        {

            System.out.println("list is not created");

            return false;

        }

        return true;


    }

    boolean CreateIpListWithSpace(String Path)
    {
        try(PrintWriter printWriter = new PrintWriter(Path))
        {

            for(int Iterator = 0; Iterator < 256 ; Iterator++ )
            {

                printWriter.write("10.20.40."+Iterator+" ");

            }

        }
        catch (IOException e)
        {

            System.out.println("list is not created");

            return false;

        }

        return true;


    }

}
