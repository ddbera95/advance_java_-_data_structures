//package PIngCommand;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Hping {

    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder();
        //pb.directory(new File("/home/dhaval/"));
            pb.command("/bin/bash" ,"-c", "sudo hping3 -c 1 -i 1 -a 10.20.234 10.20.40.234 ");
            pb.redirectOutput(new File("/dev/pts/6"));
            pb.redirectError(new File("/dev/pts/6"));
            Process p = pb.start();

            Thread.sleep(5000);

            //System.out.println(pb.environment());
        for(int  i =0; i<10; i++)
        {
            PrintWriter ps = new PrintWriter("/dev/pts/6");

            ps.write("hello");
            //System.out.println("i");
            pb.start();
        }
    }
}
