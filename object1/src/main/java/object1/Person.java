package object1;

// Define a class
public class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0; //units are in centimeters

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
