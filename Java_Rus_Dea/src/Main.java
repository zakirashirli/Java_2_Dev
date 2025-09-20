//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 5 / 2;
        System.out.println(a);

        int b = 5 + 1;

        b += 1; // +1
        b -= 1; // -1
        b *= 1; // *1
        b /= 1; // /1 = b
        b %= 1; // %1


        System.out.println(b);
        int num = 100;
        num += 5;

        System.out.println(num);


        int x = 10;

        ++x;
        System.out.println(x);
        System.out.println(x);
        boolean first = true; // !first true->false
        boolean second = false; // !second false->true
        if(5 != 4) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        int[] nums = {99, 100, 200};

        boolean isGreater100 = nums[1] >= 100;
        System.out.println(isGreater100);
        System.out.println(nums[1] >= 100);
        System.out.println(nums[2] == 100);
    }
}