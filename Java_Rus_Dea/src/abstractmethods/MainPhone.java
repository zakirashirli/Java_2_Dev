package abstractmethods;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        IPhone phone1 = new IPhone();
        String stringmy = new String();
        stringmy = "Suel";
        String name = "Suel";
        Scanner scanner = new Scanner(System.in);
        phone1.brand = "Apple";
        phone1.model = "17 pro max";
        phone1.storage = 512; // gb
        phone1.userPhoto = "myphoto.png";
        phone1.sentMessage = scanner.nextLine();

        phone1.phoneInfo();
        phone1.takePhoto();
        phone1.sendMessage();

        scanner.close();

    }
}

abstract class Phone{
    String brand;
    String model;
    Integer storage;
    String sentMessage;
    String userPhoto;


    abstract void phoneInfo();
    abstract void sendMessage();
    abstract void takePhoto();

}

class IPhone extends Phone {
    @Override
    void phoneInfo(){
        System.out.println("Phone brand: " + brand);
        System.out.println("Phone model: " + model);
        System.out.println("Phone storage: " + storage + " gb"); // 512 gb
    }

    @Override
    void sendMessage(){
        System.out.println("message was sent: " + sentMessage);
    }

    @Override
    void takePhoto(){
        System.out.println("User's photo: " + userPhoto);
    }
}

class SearchPhone extends Phone {

    @Override
    void phoneInfo() {

    }

    @Override
    void sendMessage() {

    }

    @Override
    void takePhoto() {

    }
}
