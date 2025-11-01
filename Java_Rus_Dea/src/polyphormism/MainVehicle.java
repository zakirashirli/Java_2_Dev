package polyphormism;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicles = new Vehicle();
        vehicles.brand = "audi";
        vehicles.model = "Rs8";
        vehicles.numDoor = 4;
        vehicles.speed = 300;
        vehicles.price = 100000;
        vehicles.car_info();

        Bmw bmw1 = new Bmw();
        bmw1.brand = "M5";
        bmw1.model = "F90";
        bmw1.numDoor = 5;
        bmw1.speed = 340;
        bmw1.price = 140000;
        bmw1.carSpeed();
        bmw1.carPrice();
        bmw1.car_info();


    }
}

class Vehicle {
    String brand;
    String model;
    int numDoor;
    int speed;
    double price;

    void carSpeed() {
        System.out.println("Car's max speed");
    }
    void carPrice() {
        System.out.println("Write price for the car");
    }
    void car_info() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(numDoor);
        System.out.println(price);
        System.out.println(speed);
    }
}

class Bmw extends Vehicle{
    @Override
    void carSpeed() {
        System.out.println(speed + " km/h");
    }
    @Override
    void carPrice() {
        System.out.println("price for this car is " + price);
    }
}

class Mercedes extends Vehicle{
    @Override
    void carSpeed() {
        System.out.println(speed + "km/h");
    }
    @Override
    void carPrice() {
        System.out.println("price for this car is " + price);
    }
}
