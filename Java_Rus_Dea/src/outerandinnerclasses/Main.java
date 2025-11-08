package outerandinnerclasses;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carEngine();
    }
}


class Car {
    String brand = "bmw";

    void carEngine() {
        Engine engine = new Engine();
        engine.startEngine();
    }

    class Engine {
        void startEngine() {
            System.out.println("Машина " + brand + " завелась.");
        }
    }
}
