package src.stack;

import java.util.Stack;

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

    // reverse a string using stack

    Stack<Character> newStack = new Stack<>();
    String str = "Hello World";
     
    char arr[] = str.toCharArray();
    for(int i=0; i< arr.length;i++){
        newStack.push(arr[i]);
    }
    // pop the element and store in the char arr
    for(int i=0; i< arr.length;i++){
        char val = newStack.pop();
        arr[i] = val;
    }
    str = new String(arr); //converting char array to string.
    System.out.println("reversed string:"+str);

    // check palindrome of linked list using stack
    // In this case what we can do is reverse of the number or a string is equal then its palindrome
    // so we will pull each element in linked list to stack, stack will be in reverse of linked list
    //  and then pop each element and compare it with the linked list head and move the head ahead
    //  if head is not equals to top it means its not a palindrome .
}
}
