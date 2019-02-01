package Encapsulation;

public class Main{
    public static void main(String[] args) {
        Hambrurger hambrurger = new Hambrurger("Dicks","Human",69,"White");
        double price = hambrurger.itemizedHamburger();
        hambrurger.addHamburgerAddition1("Tomato", 10);
        hambrurger.addHamburgerAddition2("Pickles",69);
        hambrurger.addHamburgerAddition3("Cheese",33);
        System.out.println("Total Burger price is " + hambrurger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Human", 45);
        healthyBurger.itemizedHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 3);
        healthyBurger.addHealthAddition1("Lentils", 2);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizedHamburger();
    }
}
