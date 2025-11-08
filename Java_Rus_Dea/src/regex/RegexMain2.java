package regex;

import java.util.Scanner;

public class RegexMain2 {
    public static void main(String[] args) {
        // example 1
        System.out.println("aaaaaaaaaa".matches("a+"));

        // example 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String word = sc.nextLine();

        if (word.matches("[A-Z][a-z][0-9]+")){
            System.out.println("matches");
        } else {
            System.out.println("does not match");
        }
    }
}
