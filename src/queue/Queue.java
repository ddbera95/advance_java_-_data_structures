package queue;

import LinkedList.DoublyList;

public class Queue<T> {

    private int size = 0;
    private DoublyList<T> arr = new DoublyList<>();

    public void enqueue(T data){

        arr.add(data);
        size++;

    }

    public T dequeue(){
        if(size == 0){
            throw new RuntimeException("queue is empty");

        }
        size--;
        return arr.removeAt(1);
    }

    public T peek(){

        if(size == 0){
            throw new RuntimeException("queue is empty");
        }
        return arr.getData(1);
    }

    public static void main(String[] args) {

        Queue<Integer> q = new Queue<>();

        q.enqueue(1);
        q.enqueue(2);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(4);
        System.out.println(q.peek());
    }
}
