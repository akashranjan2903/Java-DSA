package src.Queue;



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
}
}
