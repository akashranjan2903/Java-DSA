class Vehicle {
    String color;
    
    void print(){
        System.out.println("vehicle color" + color);
    }
}
class car extends Vehicle{
    int speed;

    void carprint(){
        System.out.println("car speed" + speed); //inherits speed from parent class
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Vehicle v1=  new Vehicle();
        v1.color = "blue";
        v1.print();

        car c1 = new car();
        c1.speed = 1;
        c1.print(); // using parent methods.by default its null
        c1.carprint();
        c1.color = "red"; // using parent property color in child.
        c1.print();
    }
}
