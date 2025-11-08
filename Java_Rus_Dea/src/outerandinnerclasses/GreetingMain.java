package outerandinnerclasses;

public class GreetingMain {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.showMessage();

    }
}

class Greeting{
    void showMessage(){
        class Message{
            void print(){
                System.out.println("Привет из локального класса!");
            }
        }
        Message msg = new Message();
        msg.print();
    }
}