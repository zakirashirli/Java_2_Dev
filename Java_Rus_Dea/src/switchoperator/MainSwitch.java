package switchoperator;

public class MainSwitch {
    public static void main(String[] args) {
        int month = 12;

        switch (month) {
            case 1:
                System.out.println("1st");
                break;
            case 2:
                System.out.println("2nd");
                break;
            case 3:
                System.out.println("3rd");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("8th day");
                break;
            case 9:
                System.out.println("9th day");
                break;
            case 10:
                System.out.println("10th day");
                break;
            case 11:
                System.out.println("11th day");
                break;
            case 12:
                System.out.println("12th day");
                break;
            default:
                System.out.println("Такого дня нет");

        }
    }
}
