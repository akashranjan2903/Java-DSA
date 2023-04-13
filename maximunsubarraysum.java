import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maximunsubarraysum {
    
    public static void main(String[] args){
    int arr[] = {1,2,7,-4,3,2,-10,9,1};
    List<Integer> list = new ArrayList<Integer>();
    int sum =0;
    int maxsum=0;
    int startindex=0;
    int lastindex=0;
    for (int i=0; i<arr.length ;i++){
        for (int j=i+1; j<arr.length;j++){
            // for the first time sum is index first
      
            if (j-1==i){
            sum= arr[i];
            }
            sum =sum+arr[j];
          if ( sum > maxsum)
          {
             // add index of subray to list which is having max sum
            startindex=i;
            lastindex=j;
            maxsum =sum;
           

          }
        
    }
    }
    int []subarray =Arrays.copyOfRange(arr, startindex, lastindex);
    System.out.println(Arrays.toString(subarray));
    System.out.println(maxsum);
}
}
