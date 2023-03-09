import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {



        public static void main(String[] args) {
            ArrayList<Integer> arr;







            arr = new ArrayList<>( Arrays.asList(1,2,3,4,5));
            Iterator<Integer> itr = arr.iterator();
            System.out.println("list: "+arr);
            System.out.println(arr.size());
            while(itr.hasNext()) {

                if (itr.next().equals(3)) {
                    Integer val = itr.next();
                    System.out.println(itr.next());
                    arr.remove(0);
                    System.out.println(arr.size());
                    //break;
//System.out.println("harsh : "+arr);
                }

            }




          /*  Iterator<Integer> it  = arr.iterator();
            for(int  i = 0; i<6 ; i++){
                System.out.println(it.next());
                if(i == 5){

                }
            }*/
            //arr.remove(0);
            /*System.out.println("___________________");
            ListIterator<Integer> itr1 = arr.listIterator();
            while(itr1.hasNext())
            {
                System.out.print(itr1.next()+" ");
            }*/
        }

}




