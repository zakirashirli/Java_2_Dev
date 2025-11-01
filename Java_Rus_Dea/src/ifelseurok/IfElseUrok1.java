package ifelseurok;

public class IfElseUrok1 {
    public static void main(String[] args) {
        boolean isRaining = false;

        if (isRaining) {
            System.out.println("Идет дождь");
        } else {
            System.out.println("Нет дождя");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }

        int x = 0;

        if (x > 0) {
            System.out.println("+");
        } else if (x < 0){
            System.out.println("-");
        } else{
            System.out.println("0");
        }

        int y = 10;
        if (y % 2 == 0) {
            System.out.println("even"); // четное
        } else if (y % 2 != 0) {
            System.out.println("odd"); // нечетное
        } else if (y == 0){
            System.out.println("0");
        }
    }
}
