package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO {

    public static void main(String[] args) throws  Exception{

        FileOutputStream f  = new FileOutputStream("/home/dhaval/new.txt");

        int integer = Integer.MAX_VALUE;

        byte[] bytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            bytes[i] = (byte)(integer >>> (i * 8));
            System.out.println((int)bytes[i]);
        }
        for(int i = 0 ; i<bytes.length;i++){
            f.write(bytes[i]);
        }


        FileInputStream in = new FileInputStream("/home/dhaval/new.txt");

        for(int i = 0; i<4 ; i++){

            int t = in.read();

            bytes[i] = (byte)t;
        }
         int result = 0;
        for(int i =3; i>=0; i--){

           // System.out.println(bytes[i]);

            result  = result | bytes[i];
        }

        System.out.println(result);

    }
}
