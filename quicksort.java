import java.util.Scanner;


public class quicksort{
    
    public static void display(int [] arr){
        System.out.println("Array is:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static int partition(int [] arr, int start, int end){
        int pivot = arr[start]; //pivot is the first element of the array.
        // find the correct index of pivot element
        int count = 0;
        for(int i=start+1; i<=end; i++){ //24,9,29,14,19,27
            if (arr[i]<=pivot){
                count++;
            }
        }
        int newPivotIndex = start+count;
        // swap the pivot index and start index
        int temp = arr[newPivotIndex]; 
        arr[newPivotIndex] = pivot;
        arr[start] = temp;
       // now put all element before pivot which is small and all element after which is large to pivot index
        int i = start;
        int j = end;
        while(i<j){

            while(i<=end && arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){ 
                j--;
            }
            // swap 
            if(i<=j){
                int temp2 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp2;
                i++;
                j--;   
            }
        }
        return newPivotIndex; //return the new pivot index.


    }
    public static void quickSort(int [] arr, int start, int end){
        //  if array is length 1 or 0, nothing to sort.
        if (start >= end){
            return;
          }
        int partition = partition(arr, start, end); //partition the array.  partition is the new pivot index.  newPivotIndex is the index of the pivot element.  arr[new
        quickSort(arr, start, partition-1); //recursively sort the left side of the array.
        quickSort(arr, partition+1, end);
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i <size ;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        display(arr);
        quickSort(arr, 0, arr.length-1); //recursively sort the array.  start and end are the indices.  arr
        display(arr);
    }
}