public class factorial_recursion {

    static int factorial(int a){
    int fact = 1;
     if (a<0){
        return -1;
     }
       if (a == 0 && a == 1){
        return 1;
       }
       if (a>1){
         fact = a*factorial(a-1);
       }
       return fact;
    }
    public static void main(String args []){

        int fact = factorial(5);
        if (fact == -1){
            System.out.println("There is no Factorial");
        }
        else{
           System.out.println("Factorial of the given number is:"+fact);
        }

    }

    }
    

