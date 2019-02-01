package Abstraction;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("oh yeah oh yeah");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flaping wings");
    }
}
