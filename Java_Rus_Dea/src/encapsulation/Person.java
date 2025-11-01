package encapsulation;

public class Person {
    private String name;
    // surname
    private int age;
    // height
    // balance
    // ....


    // помогает показать его значение
    public String getName(){
        return name;
    }

    // помогает задать ему значение
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
