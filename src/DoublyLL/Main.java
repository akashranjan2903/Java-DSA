package src.DoublyLL;

public class Main {
    public static void main (String args []){
        doubleylinkedlist list = new doubleylinkedlist();
        // list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2); 	
        list.insertLast(3);
        list.display();
        list.removeAllDuplicates();
        list.display();
        int value =list.delete(1);
        System.out.println("deleted value"+value);
        list.display();
        // get value index
        int indexValue =list.getvalue(3);
       System.out.println("list at given index is:"+ indexValue);
       // get index by value
       int index =list.getIndexByValue(4);
       System.out.println("given value is at index:"+index);
        System.out.println("size"+list.size);

    }
}
