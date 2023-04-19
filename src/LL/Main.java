package src.LL;

import java.util.ArrayList;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class Main {
public static void main (String args []){
    linkedlist list = new linkedlist();
    list.insertFirst(1);
    list.insertFirst(11);
    list.insertFirst(21);
    list.insertFirst(24);
    list.insertFirst(23);
    list.display();
    
    list.insertLast(29);
    list.display();


    list.insertAt(6, 5);
    list.display();
        
        int val =list.delete(6);
        System.out.println("deleted value is " + val);
        list.display();
    // get index value
     int vals =  list.getvalue(3);
     System.out.println("value at given index " + vals); 

    ArrayList<Integer> duplicates = list.findDuplicate();
    System.out.println("All Duplicates are " + duplicates);
    System.out.println("Linked list after removal of duplicates");
    list.display();
    // sorted linked list
    // list.selectionSortAsc();
    // list.display();
  
    list.QuickSort(list.head, list.tail);
    list.display();
    boolean check1 = list.loopCheck();
    System.out.println("check:"+check1);

    // check loop in linked list example
    // first create a linked list with loop

    linkedlist list2 = new linkedlist();
    list2.insertFirst(2);
    list2.insertFirst(1);
    list2.insertFirst(5);
    list2.insertFirst(8);
    list2.display();
    // we make the linked list in a loop by pointing the tail.next to head.next
    list2.tail.next = list2.head.next;
    // there are two approach to solve this problem.
    // 1. first create a array of size max value in linked list
    //  then iterate in linked list and check the value of that node and array at the given node value is true false
    //  if it is true it means its visisted otherwise its not.
    //  if traversing through the linked list wherever if we found that its visited in array then there is a loop in linked list.
    // 2. second approach is slow pointer and fast pointer where slow pointer steps one step and fast pointer steps 2 steps. if the slow pointer and fast pointe meets at any point of time it means there is loop inside the linked list
    
    // solving problem by second approach/ its also called as floyd law
    boolean check = list2.loopCheck();
    System.out.println("check:"+check);



     
}
}
