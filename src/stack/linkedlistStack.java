package src.stack;

public class linkedlistStack {
    
    int size;
    Node top;

    private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    void push(int val){
        Node temp = new Node(val);
    
        temp.next = top;
        top = temp;
        size++;
    }
    void pop(){
        if (top == null) return; //empty stack, nothing to pop.
        Node prev = top;
        top = top.next; //move top to next node.
        prev.next = null; //disconnect node.
        size--;
    }
    void display(){
        System.out.println("top value:"+top.val);

        Node temp = top;
        while(temp!= null){
            System.out.print(temp.val);
            if(temp.next!= null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    Node getPrevNode(Node current){
    
        Node prev = null;
        Node temp = top;

        while(temp!= null){
            if(temp == current){
                return prev;
            }
            prev= temp;
            temp = temp.next;
        }
        return prev;
    }
    linkedlistStack removeDuplicates(){
        
        linkedlistStack temp = new linkedlistStack(); //create a new stack.
        
        Node start =  top;
        while(start!= null){
        
            if(temp.top == null){
                temp.push(start.val);
                start = start.next; 
                continue;
            }
            if (temp.top.val == start.val){ // checking of the top value is present in the current stack
                start = start.next;
                continue;
            }
            temp.push(start.val);
            start = start.next;  
        }
        return temp;
    }
}
