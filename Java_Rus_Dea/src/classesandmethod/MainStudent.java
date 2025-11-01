package classesandmethod;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        Student st = new Student();
        st.setId(1);
        System.out.println(st.setId(1));
        st.findSum(6, 7);




        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("Type Student Id:");
        student1.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Type Student Name:");
        student1.name = sc.nextLine();
        System.out.println("Type Student Surname:");
        student1.surname = sc.nextLine();
        System.out.println("Type Student Lessons:");
        student1.numOfLessons = sc.nextInt();
        student1.isActive = true;

        System.out.println("Show all data");
        student1.studentInfo();
        student1.IsActiveOrNo();


        // 2nd student
        Student student2 = new Student();

        System.out.println("Type Student Id:");
        student2.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Type Student Name:");
        student2.name = sc.nextLine();
        System.out.println("Type Student Surname:");
        student2.surname = sc.nextLine();
        System.out.println("Type Student Lessons:");
        student2.numOfLessons = sc.nextInt();
        student2.isActive = false;

        System.out.println("Show all data");
        student2.studentInfo();
        student2.IsActiveOrNo();

    }
}

