package src.circularLL;

public class cicularlinkedlist {
    
    
        Node head;
        int size=0;
        Node tail;
    
    
    private class Node {
         
         Node next;
         int value;
    
    
        Node(int val){
            this.value = val;
        }
        
    } 
    void insertFirst(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        if(tail ==null){
            tail= head;
        }
        tail.next = head;
        size++;

    }
    void insertLast(int val){   //assumes that the list is not empty and the val is not already in the list.  //assumes that
      if(head == null){
        insertFirst(val);
        return;
      }
      Node temp = new Node(val);
      tail.next = temp;
      tail = temp;
      tail.next = head;
      size++;
    }
       Node  getPrevNode(int index){
        if(index == 0){
            return null;
        }
        Node temp = head;
        for(int i =1; i<index;i++){
            temp = temp.next;
        }
        
       return temp;
       }
       int deleleIndex(int index){
        if(index ==0){
            int deletedValue=head.value;
            head= tail = null;
            return deletedValue;
        }
        if(index>= size){
            return -1;
        }
        Node prev = getPrevNode(index);
        int deletedValue = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return deletedValue;
           
       }
       int getIndexvalue(int index){
          
        if(index== 0){
            return head.value;   
        }
        if(index >= size){
            return -1;
        }
         Node current = getPrevNode(index).next;
         return current.value;
       }
       void removeAllDuplicates(){
        
        Node start = head;
        Node temp = start.next;

        while(start!= tail){

            Node p1 = start;
            while(temp!=head){

                if(temp.value == start.value){
                    p1.next = temp.next; 
                    if(temp == tail){
                      tail = p1;
                    }
                    temp = temp.next;  
                }
                else{
                    p1= p1.next;
                    temp = temp.next;
                }
                size--;
            }
            start = start.next;
            temp = start.next;  // for the next iteration of loop.
        }
       }
        void display(){
        Node temp = head;
        System.out.println("head"+head.value);
        System.out.println("tail"+tail.value);
        System.out.println("tailnext:"+tail.next.value);
        do{
            System.out.print(temp.value);
            if (temp != tail){
                System.out.print("->");
            }
            temp = temp.next;
        }
        while(temp != head);

         System.out.println();

        
    }
}
