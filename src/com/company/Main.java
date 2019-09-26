package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Student").print();
        System.out.println("_________________");
        createObject("Teacher").print();
        System.out.println("_____________");
        createObject("Administrator").print();
        System.out.println("______________");

    }

    public static Printable createObject(String className){
        Printable printable = null;
        switch (className){
            case "Student": printable = new Student("Tan Ah Teck","1 Happy Ave");
            break;
            case "Teacher":
                printable = new Teacher("Paul Tan","Ahunbaeva 128");
                break;
            case "Administrator":
                printable = new Administrator("Nurgazy",  "'10 mkrn ");
        }
        return  printable;
    }
}
