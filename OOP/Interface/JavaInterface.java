public class JavaInterface {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //                     that implementing classes MUST define.
        //                     Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}
interface Prey {

    void flee();
}
interface Predator {

    void hunt();
}
class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("*The rabbit is running away*");
    }
}
class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("*The hawk is hunting*");
    }
}
class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("*The fish is swimming away*");
    }

    @Override
    public void hunt(){
        System.out.println("*The fish is hunting*");
    }
}