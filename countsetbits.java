public class countsetbits {

   static int countset(int n){
        int count=0;
        // when we & with integer it will check bitwise 
        while(n>0){
           if ((n & 1) == 1){
              
            count++;
           }
        //    >> , << are two operators which will make right and left shift to the binary number of given number
           n = n >>1;
    }
    return count;
}
public static void main (String[] args) {
        int n = countset(5);
        System.out.println("total number of 1 present is"+ n);
}
}
