import java.util.Arrays;
import java.util.Scanner;

public class mergesort{
    public static void display(int [] arr){
        System.out.println("Array is:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static int [] mergeSort(int [] arr){ //arr is the array to be sorted, left is the left end point, right is the right end point.
        if  (arr.length <=1){
        return arr;
       }
       int  mid = arr.length/2;

         int [] leftarray= mergeSort(Arrays.copyOfRange(arr, 0,mid));
         int [] rightarray= mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
         
         return merge(leftarray, rightarray);
         
       
    }
    public static int [] merge(int [] leftarr, int [] rightarr){
       int i = 0;
       int j = 0; 				
    int [] newarr = new int [leftarr.length+rightarr.length];
    int k =0 ;
    while (i < leftarr.length && j < rightarr.length){
        if (leftarr[i]<rightarr[j]){
            newarr[k++] = leftarr[i++];
        }
        else{
            newarr[k++] = rightarr[j++];
        }
    }
    while (i < leftarr.length){//if there is still elements in the left array to be copied to the result array.
       newarr[k++] = leftarr[i++];
    }
    while (j < rightarr.length){//if there is still elements in the right array to be copied to the result array.
    newarr[k++] = rightarr[j++];
    }
    return newarr;  //return the result array.
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
        int []newarr= mergeSort(arr);  //calling the method to sort the array.
        display(newarr);
    }
}