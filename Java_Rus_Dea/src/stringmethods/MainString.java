package stringmethods;

import java.sql.SQLOutput;

public class MainString {
    public static void main(String[] args) {
        String name = "Hello";
        String nameCapital = "wretyrutiy";

        System.out.println(name.equals(nameCapital)); // false
        System.out.println(name.equalsIgnoreCase(nameCapital)); // true
        System.out.println("========================================");
        System.out.println(name.startsWith("Z"));
        System.out.println(nameCapital.endsWith("r"));
        System.out.println("========================================");
        System.out.println(name.compareTo(nameCapital));
        System.out.println("========================================");
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println("========================================");
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println(nameCapital.substring(2,6));


        String my_str1 = "@";
        String my_str2 = " ";
        if (my_str1.compareTo(my_str2) > 0) {
            System.out.println("Positive");
        } else if (my_str1.compareTo(my_str2) == 0) {
            System.out.println("equals 0");
        } else if (my_str1.compareTo(my_str2) < 0) {
            System.out.println("Negative");
        }

        System.out.println(my_str1.compareTo(my_str2));


       String hello = "Hello My name is Lala, and My sister is Leyla";

        System.out.println(hello.replace("l", "lololololo"));

    }
}
