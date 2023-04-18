package src.stack;

public class Main {
    public static void main (String args []){
    // array stack implementation
    // arraystack stack = new arraystack(5);
    // stack.push(3);
    // stack.push(1);
    // stack.push(3);
    // stack.push(4);
    // int peek = stack.peek();
    // System.out.println("peek"+peek);
    // stack.display();
    // int top = stack.pop();
    // System.out.println("top:"+top);
    // System.out.println("actualtop:"+stack.top);
    // stack.display();
    // int index =stack.searchIndexByValue(67);
    // System.out.println("given value is at index:"+index);
    // int value = stack.searchvalue(3);
    // System.out.println("Value at given index is:"+ value);
    // // remove duplicates
    // arraystack temp =stack.removeDuplicates();
    // temp.display();  // display the arraystack after removal of duplicates.
     
    // linked list stack implementation
    linkedlistStack lstack = new linkedlistStack();
    lstack.push(2);
    lstack.push(1);
    lstack.push(1);
    lstack.push(1);
    lstack.push(11);
    lstack.pop();
    lstack.display();
    linkedlistStack lstackNew=lstack.removeDuplicates(); //this duplicate function is for continous duplicates 
    lstackNew.display();
}
}
