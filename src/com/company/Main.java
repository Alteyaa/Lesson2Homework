package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Student");
        System.out.println("_________________");
        createObject("Teacher");
        System.out.println("_____________");
        createObject("Administrator");
        System.out.println("______________");

    }

    public static void createObject(String className){
        switch (className){
            case "Student":
            Student s = new Student("Student","Isanova 128");
            System.out.println("Название :" + s.getName() + "/n");
            s.print();
            break;
            case "Teacher":
                Teacher t = new Teacher("Teacher","Ahunbaeva 128");
                System.out.println("Название : " + t.getName() + "/n");
                t.print();
                break;
            case "Administrator":
                Administrator administrator = new Administrator("Nurgazy", "mkrn 10");
                System.out.println("Название:" + administrator.getName() + "/n");
                administrator.print();
        }
    }
}
