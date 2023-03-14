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

           ProcessBuilder pb = new ProcessBuilder(command);

           pb.redirectError(new File("/home/dhaval/Ping/output.txt"));

           Process process = pb.start();

           process.waitFor();

           BufferedReader outputError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

           String OutputLine;

           System.out.println("Errors");

           while((OutputLine = outputError.readLine()) != null)
           {

               System.out.println(OutputLine);

           }

       }
       catch (IOException e)
       {

           System.out.println(e.getMessage());

           System.out.println("please enter the right Input , please try again with valid Path input \n");

           return;

       }
       catch (Exception e)
       {

           System.out.println("interupted Exception");

       }



   }

    public static void main(String[] args) {

       PingUtility check = new PingUtility();

       check.CheckUpIPList("/home/dhaval/Ping/ping.txt");

        System.out.println("exiting ____________________-");

    }

}











