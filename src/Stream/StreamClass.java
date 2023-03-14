package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamClass {


    public static void main(String[] args) {



        List<Integer> list = Arrays.asList(1 , 45 , 90 , 78 , 9 , 56 );


       list =  list.stream().map(x-> {
            System.out.println(x*x);
            return x*x;
        }).collect(Collectors.toList());


        /*IntStream.generate( z -> {if(z==0 || z ==1){z++;
            System.out.println(z);} return z = z+(z-1);}).*/

        for(int x:list){

            System.out.println(x);
        }
    }
}
