import java.util.Scanner;


public class insertionsort {

    public static void display(int [] arr){
        System.out.println("Array is:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main (String [] args){

    // insertion sort is bascially looping over each array value and check whether the number is small or not than the previous one if it is then swap it. We have to do this until the number is samll with the previous one.
    Scanner sc = new Scanner(System.in);
    int size =  sc.nextInt();
    int [] arr = new int[size];
    for(int i=0; i <size ;i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    display(arr);
    for(int i=1; i<arr.length;i++){

    while(i-1>=0 && arr[i-1]>arr[i]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }
    }
    display(arr);

}
}
