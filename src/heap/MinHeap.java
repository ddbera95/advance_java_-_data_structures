package heap;

public class MinHeap<T extends Comparable> {



    private int d , sz ;
    private T[] arr;

    private int  max_size;
    private int   child[] , parent[];



    MinHeap(int d , int max_size){

        this.d = Math.max(2,d);
        this.max_size = max_size;

        arr = (T[])new Comparable[max_size];
        child = new int[max_size];
        parent = new int[max_size];
        for(int i = 0 ; i<max_size ; i++){

            child[i] = i*d + 1;
            parent[i] = (i-1)/d;

        }

    }



    public int size(){
        return sz;
    }
    public boolean isEmpty(){
        return sz == 0;
    }
    public int arrSize(){
        return max_size;
    }

    public void add(T data){

        if(data == null)throw new RuntimeException("data is null");
        if(sz == max_size)throw new RuntimeException("array is full");
        arr[sz] = data;
        swim(sz);
        sz++;
    }

    public T peek(){

        if(isEmpty())throw new RuntimeException("empty");

        return arr[0];
    }

    public T remove(){

        if(isEmpty()) throw new RuntimeException("Array is null");

        swap(0 , sz-1);

        T data = arr[--sz];
        arr[sz] = null;

        sink(0);

        return data;
    }

    public void sink(int i){


        for(int j = minChild(i); j != -1;){

            swap(i , j);
            i = j;
            j = minChild(i);

        }


    }
    public void swim(int i){

      while(less(i , parent[i])){
          swap(i , parent[i]);
          i = parent[i];
      }

    }

    public int minChild(int i){


        int index = -1, from = child[i]  , to = Math.min(sz , from+d);
        for(int j = from ; j < to;j++){

            if(less(j,i))index = i = j;
        }

        return index;
    }

    public boolean less(int j , int i){


        return arr[j].compareTo(arr[i]) < 0;
    }

    public void swap(int i , int j){


        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
