import java.util.*;

public class pairsum {
    public static void main (String [] args){

        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        int sum =5;
        int tempsum=0;
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // iterate over each element one by one find the sum
         for (int i=0; i< arr.length-1; i++){
            //iterate from first to last for each elements
            for (int j=i+1; j < arr.length; j++){
              tempsum = arr[i]+arr[j];
              if (tempsum == sum) {

              ArrayList<Integer> templist = new ArrayList<Integer>();
               if (arr[j]>arr[i]){
                   templist.add(arr[i]);
                   templist.add(arr[j]);
                   System.out.println(templist);
               }
               else{
                    templist.add(arr[j]);
                   templist.add(arr[i]);
               }

                    list.add(templist);
                
                }
              }
            }
            System.out.println(list);
         }
        
           
         
    }

