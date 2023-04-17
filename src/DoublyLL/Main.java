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


        System.out.println("size"+list.size);

    }
}
