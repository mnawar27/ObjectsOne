package object1;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args){
        Dog dog1 = new Dog("Bruno", 2, "Alaskan");
        Dog dog2 = new Dog("Leo", 4, "Husky");


        Dog[] dogs = new Dog[2];

        dogs[0] = dog1;
        dogs[1] = dog2;

        System.out.println(dog1.name);
        System.out.println(dogs[0].breed);
    }
}