package Abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Faggot");
        dog.breath();
        dog.eat();

        Bird bird =  new Parrot("Idiot");
        bird.breath();
        bird.eat();
        bird.fly();

        Animal animal = new Dog("fagg");
        animal.breath();
        animal.eat();

        Penguin penguin = new Penguin("MEep");
        penguin.fly();
    }
}
