package ifelseurok;

public class MainUser {
    public static void main(String[] args) {
        // 1. boolean user isActive = true
        // 2. if user isActive = false delete

        boolean isActive = true;

        if (isActive){
            System.out.println("Active User");
        } else if (!isActive) {
            System.out.println("delete the user");
        } else {
            System.out.println("there is no such a User");
        }





    }
}
