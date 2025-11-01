package extension;

public class Admin {
    private String adminName = "Admin";
    private String password = "12345678";
    private String mail = "213245@gmail.com";
    String photo = "png.jpeg";

    // 6,00

    void sharePhoto() {
        System.out.println(photo);
    }
    private void deleteUser() {
        System.out.println("deleted User");
    }

}

class User extends Admin {
    String userName = "sadfgh";

}
