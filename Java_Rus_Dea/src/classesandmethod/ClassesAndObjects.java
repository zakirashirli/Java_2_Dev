package classesandmethod;

public class ClassesAndObjects {
    int a; // null
    int b;
    String name;
    String surname;

    void myName(){
        System.out.println("my name is "     + name);
    }

    void mySurname(){
        System.out.println(surname);
    }
    void add(){
        System.out.println("Сумма");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("sum = " + (a + b));
    }

    void subs(){
        System.out.println("Вычитание");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("vicitanie = " + (a - b));
    }

    void multpl(){
        System.out.println(a*b);
    }

    void division(){
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("на 0 нельзя делить");
        }
    }
}


