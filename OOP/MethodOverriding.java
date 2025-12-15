public class MethodOverriding {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        //                                      implementation of a method that is already defined.
        //                                      Allows for code reusability and gives specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
class Animal {

    void move(){
        System.out.println("This animal is running");
    }
}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Fish extends Animal{

    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}