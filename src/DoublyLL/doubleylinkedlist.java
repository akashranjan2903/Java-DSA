package src.DoublyLL;

public class doubleylinkedlist {
    
    Node head;
    int size=0;
    Node tail;


private class Node {
     Node prev;
     Node next;
     int value;


    Node(int val){
        this.value = val;
    }
    Node(Node prev, Node next, int val){ 
        	this.value = val;
            this.next = next;
            this.prev = prev;
            
}
} 
  void insertFirst(int val){
    Node temp = new Node(val);
    if (head!= null){
    temp.next = head;
    head.prev = temp;
    head  = temp;
    }else{
        head = temp;
    }

    if(tail == null){
       tail = head;
    }
    size++;
  }
  void display(){
    // System.out.println("head"+head.value);
    // System.out.println("tail"+tail.value);
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.value);
        if(temp.next!=null){
            System.out.print("->");
            }
        temp = temp.next;
       
    }
    System.out.println();
}
}
