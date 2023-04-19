package src.Queue;

public class circularArrayQueue{

    private int [] data;
   private static final int default_size = 10; 	
   int front =0;
    int end = 0;
    int size = 0;

   public circularArrayQueue(){
       this(default_size);
    }

    public circularArrayQueue(int size) {
        this.data = new int[size];
    }
    void add(int val)  throws Exception{
         if (isFull()){
            throw new Exception("Queue is Full");
         }
         data[end] = val;
         end = (end+1)% data.length;
         size++;
         
    }
    int remove() throws Exception{
        // In queue fifo is follow so first element will be remove and the rest of the element one by one
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front];
        front = (front+1)% data.length;
        size--;
        return removed;
    }
    boolean isEmpty(){
        return size ==0;
    }
    boolean isFull(){
       return size == data.length;
    }
    void display(){

        System.out.println("front index:"+front);
        System.out.println("end index:"+end);
       int i=front;
       do
       {
            System.out.print(data[i]+"->");
            i = (i+1)% data.length;
       }
       while(i!=end);
        System.out.println("End");
    }
    int peek(){
        // gives the front value
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }
    void reverse() throws Exception{
         
        if (!isEmpty()){
        int temp =remove();
        reverse();
        add(temp);
        }
       
    }
}
