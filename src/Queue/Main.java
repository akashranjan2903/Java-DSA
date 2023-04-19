package src.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main (String args []) throws Exception{

    //  arrayQueue queue = new arrayQueue(3); 
    //  queue.add(2);
    //  queue.add(3);
    //  queue.add(4);
    //  int val =queue.remove();
    //  System.out.println("Removed Value is:"+val);
    //  queue.display();
    //  int front = queue.peek();
    //  System.out.println("front value is :"+ front);
    
    circularArrayQueue cQueue = new circularArrayQueue(4);
    cQueue.add(32);
    cQueue.add(18);
    cQueue.add(54);
    cQueue.add(3); 
    cQueue.remove();
    cQueue.add(41);
    cQueue.display();
    cQueue.reverse();
    cQueue.display();

    // print binary of n numbers using queue

    Queue<String> binary = new LinkedList<String>();
    ArrayList list = new ArrayList<>();
    binary.add("1");
    for(int i=0;i<10;i++) {
      String str = binary.remove();
      list.add(str); // add 1 to list

      // now adding 0 and 1 in 1 will give 2 and 3 and so on
      binary.add(str+"0"); // add 0 to binary queue
      binary.add(str+"1"); // add 1 to binary queue
    }
    //print the list
    for(int i=0;i<10;i++) {
       System.out.println(list.get(i));
    }
}
}
