package heap;

public class test {

    public static void main(String[] args) {

        MinHeap<Integer> heap = new MinHeap<>(2,1000);

        System.out.println(heap.size());
        heap.add(1);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(7);
        heap.add(8);
        heap.add(5676);
        heap.add(-567);
        heap.add(0);
        heap.add(-25);
        System.out.println(heap.size());
       // System.out.println(heap.peek());

        for(int i = 0,t=heap.size(); i < t; i++){
            System.out.println(heap.remove());
        }


        //System.out.println(heap.size());
    }
}

