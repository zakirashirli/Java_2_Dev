package abstractmethods;

public class MyPhone {
    public static void main(String[] args) {

    }
}

abstract class Devices{
    String brand;
    String model;
    int storage;
    double price;

    abstract void phoneInfo();
    abstract void writeText();

    void discount(double percent) {
        price -= (price * percent / 100);
        System.out.println("Новая цена! " + price);
    }

}
