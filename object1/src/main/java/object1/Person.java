package object1;

// Define a class
class Person {
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

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);


        /* Now you can use the Object `person1` */

        Person person2 = new Person("Faisal", 24, 168);
        System.out.println(person2.height);

    }
}
