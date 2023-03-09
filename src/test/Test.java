package test;

import java.io.IOException;

public class Test {

    final int x;





    public void  m1(boolean flag){

        final int y;

        if(true){
            y = 10;
        }

        System.out.println(y);
    }

    Test(){
        x = 10;
    }

    public static void main(String[] args) throws  Exception {



        demo d = new demo();
        System.out.println(d.i);

     /*  try{
           var x = 100l;
           System.out.println(x);
           throw new IOException("hello world");
       }
       finally {
           System.out.println("hello world");
       }*/


    }

}


class demo{

    protected  int i;
}
