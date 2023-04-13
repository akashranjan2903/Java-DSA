import java.util.Scanner;

public class bubbleSort {
    public static void display(int [] arr){
        System.out.println("Array is:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main (String [] args){

    // Bubble sort is vice versa of selection sort here we find the largest number and swap it 
    Scanner sc = new Scanner(System.in);
    int size =  sc.nextInt();
    int [] arr = new int[size];
    for(int i=0; i <size ;i++){
        arr[i] = sc.nextInt();
    }
    display(arr);
    
    for(int i=0; i < arr.length-1; i++){//32,6,2
       

       for(int j = 0; j<arr.length-i-1 ; j++){
        
             if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;  
                }

             }

       }
       display(arr);

       }
    }
    

