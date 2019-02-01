package Encapsulation;

public class DeluxeBurger extends Hambrurger {
    public DeluxeBurger() {
        super("Deluxe burger", "Sausage", 69, "White supremacy");
        super.addHamburgerAddition1("chips", 3.99);
        super.addHamburgerAddition2("Drink", 3);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additions allowed to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additions allowed to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additions allowed to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additions allowed to deluxe burger");
    }
}
