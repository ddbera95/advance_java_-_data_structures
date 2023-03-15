package PIngCommand;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PingUtility {



    void CheckUpIPList(String Path){


       /*try
       {

           CreateIpFile2 ListCreator = new CreateIpFile2();

           if(!ListCreator.CreateIpList(Path))
           {
               return;
           }

       }
       catch (Exception e)
       {

           System.out.println("Something Went wrong!! please try again");

           return;

       }*/

       try(FileReader fileREader = new FileReader(Path);
           BufferedReader ipreader = new BufferedReader(fileREader);)
       {

           String Ip;

           List<String> command = new ArrayList<>();

           command.add("fping");

           command.add("-c3");

        //   command.add("-i1");

          // command.add("-t2000");

           command.add("-q");

           while(( Ip = ipreader.readLine()) != null)
           {

                command.add(Ip);

           }

           ProcessBuilder processBuilder = new ProcessBuilder(command);

           processBuilder.redirectError(new File("/home/dhaval/Ping/output.txt"));


           Process process = processBuilder.start();

           int processCode = 0;

           try
           {

               processCode =  process.waitFor();


           }

           catch (InterruptedException proceeInteruptException)
           {

               System.out.println(proceeInteruptException.getMessage());

                   return;
           }

           if(processCode == 1)
           {

                processBuilder.redirectErrorStream(true);

                return;

           }

              try( BufferedReader processErrorReader = new BufferedReader(new InputStreamReader(process.getErrorStream())))
              {

                  String ErrorLine;

                  while ((ErrorLine = processErrorReader.readLine()) != null) {

                      System.out.println(ErrorLine);

                  }
              }
              catch (IOException readerIoException)
              {

                  System.out.println(readerIoException);

              }


       }
       catch (IOException e)
       {

           System.out.println(e.getMessage());

           System.out.println("please enter the right Input , please try again with valid Path input \n");

           return;

       }
       finally {


       }




   }

    public static void main(String[] args) {

       PingUtility check = new PingUtility();

       check.CheckUpIPList("/home/dhaval/Ping/ping.txt");

       System.out.println("exiting ____________________-");

    }

}











