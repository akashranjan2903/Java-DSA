package src.Queue;

public class arrayQueue {
    
    private int [] data;
   private static final int default_size = 10; 	
    int end = 0;

   public arrayQueue(){
       this(default_size);
    }

    public arrayQueue(int size) {
        this.data = new int[size];
    }
    void add(int val)  throws Exception{
         if (isFull()){
            throw new Exception("Queue is Full");
         }
         data[end++] = val;
    }
    int remove() throws Exception{
        // In queue fifo is follow so first element will be remove and the rest of the element one by one
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        for(int i=1 ; i<data.length; i++){
             data[i-1] = data[i];
        }
        end --;
        return removed;
    }
    boolean isEmpty(){
        return 	end == 0;
    }
    boolean isFull(){
        return end == data.length;
    }
    void display(){

        for(int i=0; i< end;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("End");
    }
    int peek(){
        // gives the front value
        if(isEmpty()){
            return -1;
        }
        return data[0];
    }
}
