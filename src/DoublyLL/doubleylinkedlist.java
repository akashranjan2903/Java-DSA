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
  void insertLast(int val){
    if(head== null){
        insertFirst(val);
        return;
    }
    Node temp = new Node(val);
    tail.next = temp;
    temp.prev=  tail;
    tail = temp;
    size++;
  }
  void removeAllDuplicates(){
    if (head.next == null){
        return;
    }
    Node start = head;
    Node p1 = start; // prev node
    Node p2 = p1.next; // current node
    
    while(start != tail){
    
        while(p2!= null){
            
            if(start.value ==  p2.value){
              
                if(p2.next == null){ // it means p2 is last element and it is duplicate of start so tail will becaome prev node
                     tail = p1;
                     p1.next = null;
                     p2 = null;
        
                }
                else{
                    p1.next = p2.next;
                    p2.next.prev = p1; // connect two nodes.
                    p2 = p2.next;
                }
                size--;
            }
            else{
                p1 = p2;
                p2 = p2.next;
            }
           
        }
        if(start!= tail){
        start = start.next;
        p1= start;
        p2= p1.next;
        }
        
    }
  }
  int delete(int index){
    if (index == 0){
        int temp = head.value;
        head= tail = null;
        size--;
        return temp;
    }
    Node p1 = head; //prev node
    for (int i =1; i<= index;i++){
        p1 = p1.next;//current node of index
        if(i+1 == size){
            tail = p1.prev; // update tail node
        }
    }
    // remove the current node
    int temp = p1.value;
    
    if(p1.prev!= null){
    p1.prev.next = p1.next;
    
    }
    if(p1.next!= null){ // if there is a next node, update the next node's prev node.
     p1.next.prev =p1.prev;
}   
    p1.next = null;
    p1.prev = null;
    size--;
    
    return temp;
  }
  int getvalue(int index){ //return the value of the index node.
    if (index==0){
        return head.value;
    }
    if(index>=size){
        return -1;
    }
    int p1 = 0;
    Node temp = head;
    while(p1 != index){
        temp = temp.next;
        p1++;
    }
    return temp.value;
  }
  int getIndexByValue(int value){
    Node temp = head;
    int index =0;
    while(temp.value!= value){
        temp = temp.next;
        if(temp.next== null){// if no element is found
            return index = -1;
        }
        index++;
    }
    return index;
  }
  void display(){
   
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.value);
        if(temp.next!=null){
            System.out.print("->");
            }
        temp = temp.next;
       
    }
    System.out.println();
     System.out.println("head"+head.value);
    System.out.println("tail"+tail.value);
}
}
