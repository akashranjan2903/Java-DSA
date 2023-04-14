interface Atest {
   void printA();
}
// we can implement Atest here or in Class c also. But its better to do it in class C. As we are trying to achieve abstration(data hiding)
abstract class Btest  implements Atest{
   abstract void printB();
   public void printA(){
    System.out.println("This is Abstract interface A");
   }
}
class C extends Btest {  
    void printB(){
        System.out.println("This is Abstract B");
    }
}
public class abstraction_interface {
    public static void main(String args []){
        Btest b1 =  new C();
        b1.printB();
      b1.printA();
    }
}
