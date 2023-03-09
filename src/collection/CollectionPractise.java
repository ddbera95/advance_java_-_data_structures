package collection;

import java.util.*;

public class CollectionPractise

{

    public static void main(String[] args) {

            //list collection
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();


        //Queue

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        //set

        HashSet<Double> hashSet = new HashSet();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet  = new TreeSet<>();


        for(int  i = 0 ; i<99; i++){

            arrayList.add(i);
            linkedList.add(i);
            vector.add(i);
            stack.add(i);

            priorityQueue.add(i);
            arrayDeque.add(i);

            //hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }

        hashSet = new HashSet<>();
       /* linkedHashSet = new LinkedHashSet<>();
        hashSet.add(23);  linkedHashSet.add(23);
        hashSet.add(89);  linkedHashSet.add(89);
        hashSet.add(3769);linkedHashSet.add(3769);
        hashSet.add(34); linkedHashSet.add(34);*/

        for(int i = 0 ; i<12 ; i++){

            var x = Math.random();
            System.out.println(x);
            hashSet.add(x);
        }

        System.out.println("___________________________");

        for(double x:hashSet){

            System.out.println(x);
        }
        System.out.println("___________________________________________");
        double x = Math.random();
        System.out.println(x);

        System.out.println("____________________");
        hashSet.add(x);

        for(double y:hashSet){
            System.out.println(y);
        }

      /*  System.out.println("__________________");
        HashMap<Integer , Integer> h = new HashMap();

        h.put(1 , 23);

        Iterator it = h.entrySet().iterator();

        System.out.println(it.next());

        for(int x:linkedHashSet)
        {
            System.out.println(x);
        }*/

            /*for(int i = 0 ; i<99; i++){


                System.out.println(stack.pop());
            }*/
          //  treeSet = new TreeSet<>();
            //treeSet.add(null);
        /*System.out.println("hhhhh");

          //  treeSet.add(10);
        for(int x : treeSet){

            System.out.println(x);
        }*/

    }
}
