import java.util.Scanner;

public class heapsort {
    public static void display(int [] arr){
        System.out.println("Array is:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void upheapify(int [] arr , int i){
        // first find the parent index
        int parent = (i-1)/2;
        // check all the element is small then th parent if it is then swap the element.
        while(i>0 && arr[i]<arr[parent]){
            // swap the element and make the new parent index with the swap index
            int temp = arr[i];  // store the current element in temp.
            arr[i] = arr[parent]; // move the parent to the temp. location.
            arr[parent] = temp; // move the temp to the parent. location.
            i = parent; // move the parent index to the new parent index.
            parent = (i-1)/2; // repeat the process until the parent is at the correct position.
        }
    }
    public static void downheapify(int [] arr , int e){
       
       // swap the top element to the last index as top element is the smallest number
       int top = arr[e];  // store the top element in temp.
       arr[e] = arr[0]; 
       arr[0] = top;
       int parent = 0;
       int child1= 	2*parent + 1; // left child index.  (2*e + 1) for left child.  (2*e + 2 for right child
       int child2= 2*parent + 2;
       
       // now we check the topmost element is small or not.If it is not then we will swap with child until it is small.
       while(child1 < e || child2 < e){
           
             int minindex =parent;
        
            //  we have to check the child1 and child2 is less than the index and smaller than parent 
            if(child1< e && arr[child1] < arr[parent]){
                minindex= child1;
            }
            if(child2 <e &&arr[child2] < arr[parent]){
                minindex= child2;
            }
            if (minindex == parent){
                return;
            }
            else{
            // swap the parent and minindex element
            int temp = arr[parent];  // store the current element in temp.
            arr[parent] = arr[minindex]; // move the minindex to the temp. location.
            arr[minindex] = temp; // move the temp to the parent. location.
            }
            // now the minindex will become the parent 
            minindex = parent;
            child1=2*parent + 1;
            child2= 2*parent + 2;
            }
       }
    
    public static void heapSort(int [] arr){ 						//arr.length is assumed to be at least 1.
       for(int i=0; i<arr.length; i++)
       {
         upheapify(arr, i);
       }
       for (int i=0; i<arr.length;i++){
        downheapify(arr, arr.length-1-i);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i <size ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        display(arr);
        heapSort(arr);
        display(arr);
    }
}
