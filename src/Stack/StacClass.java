package Stack;
import LinkedList.DoublyList;
public class StacClass<T>{

    private int pointer = 0;
    private DoublyList<T> arr =  new DoublyList<T>();



    public void  push(T data){

        arr.add(data);
        pointer++;

    }

    public  T pop(){
        if(pointer == 0){
            throw  new RuntimeException("stack underflow");

        }
        pointer--;
        return arr.remove();

    }
    public T peek(int index){

        if(index > pointer || index <= 0){
            throw new RuntimeException("index is invalid");
        }

        return arr.getData(index);
    }



    public static void main(String[] args) {

        StacClass<Integer> stack = new StacClass<Integer>();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek(1));
        System.out.println(stack.peek(2));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.peek(1));
    }
}
