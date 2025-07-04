package Array.SingleArray;

abstract  class Animal{
    public abstract void makeSound();

    public void sleep(){
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
    @Override
    public void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cow cattle.");
    }
}
public class AbstactClassArray {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for(Animal a: animals){
            a.makeSound();
            a.sleep();
        }

    }
}
