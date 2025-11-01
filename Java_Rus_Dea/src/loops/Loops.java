package loops;

public class Loops {
    public static void main(String[] args) {
//        int n = 10;
//
//        while (n > 0){
//            System.out.println(n);
//
//        }


//        int i = 100;
//        int j = 200;
//
//        while(++i < --j) {
//            System.out.println("значение для i: " + i);
//
//        }

        System.out.println("do-while");
        int my_num = 1;


        do {
            System.out.println(my_num);
            my_num++;
        } while(my_num == 5);


        System.out.println("For Loop");
        for (int x = 10; x > 0; x-=2){
            System.out.println(x);
        }


        System.out.println("for each:");
        int[] numbers = {7, 15, 20, 27};

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }else {
                System.out.println("ne deletsyta");
            }

        }






    }
}
