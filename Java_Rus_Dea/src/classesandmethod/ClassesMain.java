package classesandmethod;

import java.util.Scanner;

public class ClassesMain {
    public static void main(String[] args) {
        ClassesAndObjects cao = new ClassesAndObjects();
        Scanner scanner = new Scanner(System.in);
//        cao.a = scanner.nextInt();
//        cao.b = scanner.nextInt();
        cao.name = scanner.nextLine();
        cao.myName();
        cao.surname = scanner.nextLine();
        cao.mySurname();
//        cao.add(); // 15
//        cao.subs(); // 5
//        cao.multpl();
//        cao.division();

//        ClassesAndObjects cao2 = new ClassesAndObjects();
//        cao2.a = scanner.nextInt();
//        cao2.b = scanner.nextInt();
//        cao2.add();
//        cao2.subs();

scanner.close();
    }
}
