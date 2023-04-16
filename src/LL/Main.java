package src.LL;

import java.util.ArrayList;

public class Main {
public static void main (String args []){
    linkedlist list = new linkedlist();
    // list.insertFirst(1);
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
    
    
}
}
