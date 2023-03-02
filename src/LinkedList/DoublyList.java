package LinkedList;





class Node<T>{

    T data;
    Node<T> next,prev;

    Node(T data , Node<T> prev , Node<T> next){
        this.data  = data;
        this.prev = prev;
        this.next = next;

    }


}

 public class DoublyList<T> {

    private Node<T> head;
    private Node<T> tail;
    int size = 0;

  public void  add(T data) {

      if (size == 0) {

          Node<T> node = new Node<T>(data, null, null);
          head = node;
          tail = node;
          size++;
      }
      else {

          Node<T> node = new Node<T>(data , tail , null);
          tail.next = node;
          node.prev = tail;
          tail = node;
          size++;
      }
  }

  public void addAT(int index , T data){

      if(index > size){
          throw new RuntimeException("input size is bigger");

      }
      Node<T> node = head;

      for(int i = 1; i< index ; i++){

          node = node.next;
      }


      Node<T> newNode = new Node<T>(data , node.prev , node);


       if(node == head){

          node.prev = newNode;
          head = newNode;
          size++;
          return;
      }


      node.prev.next = newNode;
      node.prev = newNode;
      size++;

  }
     public void removeAt(int index ){


        if(index > size){
            throw  new RuntimeException("insdex is bigger than size");
        }


        Node<T> node = head;


        for(int i =1; i<index;i++){

            node = node.next;
        }

         System.out.println(node.data + " removed" + " on index " + index);


        if(node == tail){

            tail = node.prev;
            tail.next = null;

            size--;
            return;
        }


        else if(node == head){

            node.next.prev = null;
            head = node.next;
            size--;
            return;
        }


         System.out.println("no ht");
        node.prev.next = node.next;
        node.next.prev  = node.prev;
        size--;

     }



     public void remove(){


      if(size == 0){
          throw new RuntimeException("linked list isempty");
      }


      if(head == tail)
      {

          head = null;
          tail = null;
          size = 0;
          return;
      }


        Node<T> node = tail;
        node.prev.next = null;
        tail = node.prev;
        size--;
     }

     public void print(){
         System.out.println(size);

         Node<T> node = head;

         for(int i = 0; i < size ; i++)
         {

             System.out.println(node.data);
             node = node.next;
         }

     }



     // main method


     public static void main(String[] args) {

                DoublyList<Integer> obj = new DoublyList<>();

                obj.add(1);
                obj.add(2);
                obj.add(3);
                obj.add(4);
                obj.add(5);
                obj.add(6);
                obj.add(7);
                obj.add(8);
                obj.addAT(1 , 11);
                obj.addAT(9 , 11);
                obj.addAT(5 , 11);

                // obj.remove();

                 obj.print();

                System.out.println("###########################");

                // obj.remove();
                obj.removeAt(1);
                // obj.removeAt(1);

                 obj.print();
                // System.out.println(obj.head);


     }

}


