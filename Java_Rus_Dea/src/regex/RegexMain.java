package regex;

import extension.Parent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    // \\d - любое число
    // "A.." - A буква А и любые два символа
    // "hello|hi" - либо hello либо hi

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("[^0-9]"); // создает шаблон
        Matcher matcher1 = pattern1.matcher("i know jv very well!"); // ищем в тексте
        boolean found = matcher1.find(); // ищет совпадение

        System.out.println("Есть ли совпадение? : " + found); // true || false


        boolean isWord = Pattern.matches("Python", "Python"); // true
        System.out.println(isWord);



        // [^abc] -> mathces."abcd" -> true
        System.out.println();
        // [^A-Z] -> a -> false, W -> true
        // [^a-z] -> A, H ->  a,z,i -> true
        // [^0-9] -> y -> false, 1,2,3 -> true


        String[] texts = {"HelloWorld12", "HiGuys", "Java_Is_easy00", "Test2025"};

        for (String t : texts) {
            boolean result = t.matches("[A-Za-z0-9]+");
            System.out.println(t + " - " + result);
        }

    }
}
