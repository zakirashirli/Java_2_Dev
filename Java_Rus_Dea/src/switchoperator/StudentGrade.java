package switchoperator;

public class StudentGrade {
    public static void main(String[] args) {
        int grade = 3;
//        String name = "Suel";

        switch (grade){
            case 1:
                System.out.println("Otlichnik");
                break;

            case 4:
                System.out.println("Xoroshist");
                break;

            case 3:
                System.out.println("Troishnik");
                break;

            case 2:
                System.out.println("ploxo");
                break;

            default:
                System.out.println("Ne sushestvuyet");
        }
    }
}
