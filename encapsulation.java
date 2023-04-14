// Encapulation using settter and getters.
class Test{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age<50){
        this.age = age;
        }
         
    }
    void print(){
        System.out.println("name"+ name + "age" + age);
    }

}
//  inheritance and polymorphism/overiding example
class child extends Test{

    @Override
    void print() {
        System.out.println("child class override method");
        super.print();

    }
    // void print(){
    // System.out.println("Another way to achieve polymorphism");
    // }
}


public class encapsulation {
    public static void main(String args []) {
        Test t1 = new Test();
        t1.setAge(49);
        t1.setName("Akash");
        t1.print();
        // overiding example
        child c1 = new child();
        c1.setAge(21);
        c1.setName("Raj");
        c1.print(); 						//child class override method.
    }
}
