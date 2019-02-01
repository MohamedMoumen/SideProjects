package Inners;

public class Main {
    public static void main(String[] args) {
        ITelephone mouPhone = new DeskPhone(696969);
        mouPhone.poweOn();
        mouPhone.callPhone(696969);
        mouPhone.answer();

        mouPhone = new MobilePhone(5648);
        mouPhone.poweOn();
        mouPhone.callPhone(5648);
        mouPhone.answer();
    }
}
