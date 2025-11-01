package extension;

public class Parent {
    String name = "Ali";
    String surname = "Aliyev";
    String eyeColor = "Blue";

    void parentInfo() {
        System.out.println(name);
        System.out.println(surname);
    }
}

class Child extends Parent{
    String name = "Elmar";
    void childInfo() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(eyeColor);
    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        System.out.println("parents info");
        parent.parentInfo();
        System.out.println("Info about the child");
        child.childInfo();
    }
}
