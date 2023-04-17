package src.circularLL;

public class Main {
    public static void main (String args []){
        cicularlinkedlist list = new cicularlinkedlist();
        // list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(2); 	
        list.insertLast(2);
        list.display();

        list.removeAllDuplicates();
        list.display();
        int value =list.deleleIndex(1);
        System.out.println("deleted value"+value);
        list.display();
        // get value index
        int indexValue =list.getIndexvalue(0);
       System.out.println("list at given index is:"+ indexValue);
    
        System.out.println("size"+list.size);

    }
}
