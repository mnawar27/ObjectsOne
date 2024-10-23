package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        //Person
        Person person1 = new Person("John", 30);

        Person person2 = new Person("Ben", 24, 168);
        System.out.println(person2.height);

        //Dog
        Dog dog1 = new Dog("Bruno", 2, "Alaskan");
        Dog dog2 = new Dog("Leo", 4, "Husky");


        Dog[] dogs = new Dog[2];

        dogs[0] = dog1;
        dogs[1] = dog2;

        System.out.println(dog1.getName());
        System.out.println(dogs[0].getBreed());

        //Cars
        Car car1 = new Car("Toyota", "rav4", 2022, 500);
        Car car2 = new Car("Toyota", "camry", 2006, 56000);
        Car car3 = new Car("Tesla", "X", 2019, 25000);

        Car[] cars = new Car[3];

        cars[0]= car1;
        cars[1]= car2;
        cars[2] = car3;

        System.out.println("car's year: " + car1.getYear());
        System.out.println(cars[1].getModel());

        //Chair
        Chair chair1 = new Chair("wood", "yellow", 4);
        Chair chair2 = new Chair("metal", "silver", 1);

        Chair[] chairs = new Chair[2];

        chairs[0] = chair1;
        chairs[1] = chair2;

        System.out.println(chair1.getLegs());
        System.out.println(chairs[1].getMaterial());
    }

}
