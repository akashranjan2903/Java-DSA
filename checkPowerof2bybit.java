import java.util.Scanner;

public class checkPowerof2bybit {

public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1)) ==0) {
        System.out.println("Number is Square root of 2");
        }
        else{
        System.out.println("Numberis not a square root of 2");
        }
}
}
