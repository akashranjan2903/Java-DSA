import java.util.*;
public class waveproblem{
    public static void main(String [] args){
        // declare 2d arary
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int table[][] = new int[x][y];
        // take input
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                table[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // display the array
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        int [] ans = new int[x*y];
        int index = 0;
        // display in wave top to bottom
        for (int i =0 ;i<y;i++){
            // order will be top to bottom and bottom to top in alternate manner
            if (i%2==0){
                for (int j =0 ; j<x; j++){
                    ans[index++] = table[j][i];
                   
                }
            }else{
                for (int j=x-1 ; j>=0; j--){
                    ans[index++] = table[j][i];
                }
            }

        }
        for (int i=0; i<ans.length; i++){
        System.out.print(ans[i]);
        }
        

    }
}