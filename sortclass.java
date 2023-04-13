import java.util.*;

// make class person
class Person{
    String name;
    int Age;
public Person(String name , int age){
    this.name = name;
    this.Age = age;
}
//display ther person
public void display(){
    System.out.println("Name: " + this.name + " Age: " + this.Age);
}

}
class agecompare implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2){
        return p1.Age - p2.Age;
    }
}
public class sortclass{
    public static void main(String[] args) {
        // create a list of person
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("John", 20));
        list.add(new Person("Bob", 30));
        list.add(new Person("Alice", 25));
        list.add(new Person("Mike", 18));
        // sort the list
        Collections.sort(list, new agecompare());
        // display the list
        for (Person p : list){
            p.display();
        }
    }
}