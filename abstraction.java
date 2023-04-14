abstract class A {
    // abstract method
    abstract void print();
    // Non- Abstarct Method
    void show(){
        System.out.println("This is non- abstract method.");
    }
    // constructor
    A(){
        System.out.println("This is Constructor");
    }
}
class B extends A{
   String name;
  // Implementing the abstarct method    
   void print(){
    System.out.println("This is abstract method");
   }
}


public class abstraction {
    public static void main(String [] args){	//Abstraction a = new Abstraction(someRealObject;, then change a.ref to a = new RefinedAb
     A a1 = new B();
     a1.print();
     a1.show();
    }
}
