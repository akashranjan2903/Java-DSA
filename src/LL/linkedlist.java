package src.LL;

import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class linkedlist {
    Node head;
    Node tail;
    int size;

    linkedlist(){
        size = 0;
    }

private class Node {
    int val;
    Node next;
 
    //  we will intialize the node with value only and its next is null  by default 
    private Node(int val){
        this.val = val;
    }
    // we will intialize the node with value only and its next is pointing/refrencing to some node.
    private Node(int val, Node next){
        this.val = val;
        this.next = next;   
    }
  }
  
  // insert the element from start
  void insertFirst(int val){
    Node temp = new Node(val);  //we will create a new node with the value val.  it will be a single reference variable.  so we will create
    temp.next = head;
    head = temp;
    if (tail == null){
        tail = head;
    }
    size+=1;
  }
  //insert at last using tail
  void insertLast(int val){
    
    if (tail ==  null){
        insertFirst(val);
        return;
    }
    Node temp = new Node(val);
    tail.next = temp;
    tail = temp;
    
    size +=1;
  }
  // display the ll
  void display(){
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.val);
        if(temp.next!=null){
            System.out.print("->");
            }
        temp = temp.next;
       
    }
    System.out.println();
}
   // get the previous linked list Node from index
  public  Node getNode(int index){
    
    Node temp = head;
     for (int i=1 ; i<index ; i++){
         temp = temp.next;
     }
     return temp;
   }
   // insert at given index
    public void insertAt(int index, int val){
      
        if (index>= size){
           insertLast(val);  //insert at last.  we will create a new node with the value val and insert it at the end of the list.  so, we will create a new node with the value val and insert it at the end of the list.  so, we will create a new node with the value val and insert it at the end of the list.  so, we will create a new node with the value val and insert it at the end of the list.  so, we will create a new node with the value val and insert it at the end of the list.  so, we
           return;
        }
        if (index<=0){
            insertFirst(val);  // insert at first.  we will create a new node with the value val and insert it at the beginning of the list.  so, we will create a new node with the value val and insert it at the beginning of the list.  so, we will create a new node with the value val and insert it at the beginning of the list.  so, we will create a new node with the value val and insert it at the beginning of the list.  so, we
            return;

        }
        Node prev = getNode(index);
        Node newNode = new Node(val);  //create a new node with the value val and insert it at the specified index.  so, we will
        newNode.next = prev.next;
        prev.next = newNode;
        size=+1;
        
    }
    // delete the given index and return the deleted value
    int delete(int index){
        if (index==0){
        Node temp = head;
        head = head.next;
        size--;
        return temp.val;
    }
    if (index >= size){
        return -1;
    }
    Node prev = getNode(index);  //prev is the node just before the target index.  so, we will get the node just before
    int val = prev.next.val;  //the target index and store it in val.  so, we will return val.  so, we will return
    //check for the last value if it is then change tail
    if (prev.next.next!= null){
    prev.next = prev.next.next;
    }
    else{
        prev.next = null;
        tail = prev;
    }
    size--;
    return val;
    }
    // search value with the given index and return it.
    int getvalue(int index ){
        if (index==0 && head!= null){
            return head.val;
        }
        if (index>= size && index <0){
            return -1;
        }
        Node temp = getNode(index);  //temp is the node just before the target index.  so, we will get the node just before the target
        return temp.next.val;
    }
    // find one or more duplicate return it and remove the node 
    ArrayList<Integer> findDuplicate(){
      
        if (head == tail){
            return null;
        }
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
         
        
        Node start = head;
        Node end = start.next;
        
       while(start != tail){
        Node temp = start; // this node is created to get the tract of previous node of the end.
        int counter = 0; //counter to add the duplicate value only one time
        while(end!= null){
            if (start.val == end.val){
                counter +=1;
                if (counter ==1){
                duplicates.add(Integer.valueOf(start.val));
                }
                // here we will remove from end
                if (end.next!= null){
                    temp.next = end.next;
                   end = end.next;
                }
                else{
                    temp.next = null;
                    end = null;
                    tail = temp;
                }
                size--;
            }
            else{
                temp = temp.next;
                if (end.next!= null){
                end = end.next;
                }
                else{
                    end = null;
                }
            }

        }
        
        if(start.next != null){// check if the start is not null
            start = start.next;
        }
        if(start.next!= null){// check if the satrt next next is not null only then end is null and end is the end of the linked list.  so, end = null.
        end = start.next;
        }
        
    }
        return duplicates;
    
    }
    // sort a linked list
    // here we are sorting linked list using selection sort
    // find prev Node
    Node prevNode(Node current){
        // we will check from head if the node matcher or not it it matches return the prev node
        if(current == head){
            return null;
        }
        Node prev =head;
        Node temp =  head.next;

        while(temp != current){
            prev = temp;
            temp = temp.next;
        }
        return prev;

    }
    void sortAsc(){
      
         Node start =head.next;
         
         Node p1 = start;
      for(int i=1; i<size; i++){
        
        Node p2 = prevNode(p1);
        while( p2!= null && p1.val<p2.val){
            Node prev = prevNode(p1);// we need this to get the prev of p1,we cant use p2 here beacuse we also need the previous of p2,so we are using temp prev for p1
            // swap the value
            int temp = p1.val;
            p1.val = prev.val;
            prev.val = temp;
            //p1 and p2 will keep on decreasing
            p1 = prev;
            p2 = prevNode(p2);
        }
        start = start.next;
        p1= start;
        
      }
        
    }
}