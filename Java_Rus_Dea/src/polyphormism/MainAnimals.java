package polyphormism;

public class MainAnimals {
    public static void main(String[] args) {
        Animal animals = new Animal();
        Dog dog1 = new Dog();
        Duck duck1 = new Duck();

        animals.sound();
        dog1.sound();
        duck1.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Duck extends Animal {
    @Override
    void sound() {
        System.out.println("Duck is ducking");
    }
}
