import java.util.Scanner;

public class selectionsort {

    public static void main (String [] args){

        // selection sort is basically finding the smallest number and then replacing it one by one index.It basically has sorted and unsorted array.
       
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i <size ;i++){
            arr[i] = sc.nextInt();
        }
        // display the array
        for (int i=0; i <size ;i++){
            System.out.print(arr[i]+",");
        }
        // selection sort // 8,6,4,2

        for (int i=0; i<arr.length- 1 ; i++){
            int small = arr[i];
            int tempIndex=i;
            for (int j = i+1; j < arr.length; j++){
                  if (arr[j]< small){
                    small = arr[j];
                    tempIndex = j;//index of smallest number so far.
                  }
            }
            int temp = arr[i];
            arr[i]= small;
            arr[tempIndex]= temp;
        }
        System.out.println();
        // display the array
        for (int i=0; i <size ;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
