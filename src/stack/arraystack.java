package src.stack;
// array stack is generally fixed in size
public class arraystack {
    int capacity;
    int arr[];
    int top;

    arraystack(int size){
        this.capacity = size;
        this.arr = new int[size];
        this.top = -1;
    }
    // check if stack is empty
    boolean checkEmpty(){
        return top == -1;
    }
    // check if stack is full
    boolean checkFull(){
        return top ==  capacity -1;
    }
    void push(int val){
        // check if stack is full
        if (checkFull()){
             return;
        }
        top++;
        arr[top] = val;
    }
    int pop(){
        // check if the stack is empty
        if (checkEmpty()){
            return -1;
        }
        int val = arr[top];
        top--;
        return val;
    }
    void display(){
        int temp =top;
        System.out.println("capacity of stack:"+capacity);
        while (temp!= -1){
            System.out.println(arr[temp]);
            temp--;
        }
    }
    int peek(){
        // return top element 
        if (checkEmpty()){
            return -1;

        }
        return arr[top];
    }
    int searchIndexByValue(int value){
        // check if stack is not empty
        if(checkEmpty()){
            return -1;
        }
        int temp = top; 	// store the current top index
        while(temp!= -1 && arr[temp]!= value){
            temp --;
        }
        return temp;
    }
    int searchvalue(int index){
        if(checkEmpty()){
            return -1;
        }
        if(index>top ){
            return -1;
        }
        int temp = arr[top];
         int temptop = top;
        while(temptop != index){
           
            temptop--;
            temp = arr[temptop];
        }
        return temp;
    }
    boolean checkstack(arraystack stack ,int val){
       
        int temp = stack.top;
        
        while(temp!=-1){
            if(stack.arr[temp] == val){
                return true;
            }
            temp = temp-1;
        }
        return false;
    }
    arraystack removeDuplicates(){
        // though we cant remove delete value from array so we are gonna use temp array and then replace the temp array with provided one
     arraystack temp = new arraystack(capacity);
     int temptop = 0;

     while(temptop!=top+1){
        Boolean flag = checkstack(temp ,arr[temptop]);
      if(flag){
        temptop++;
      }
      
      else{
        
      temp.push(arr[temptop]);
      temptop++;
      }

    }
    return temp;
}
}
