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

    public static Printable createObject(String className){
        Printable printable = null;
        switch (className){
            case "Student": printable = new Student("Tan Ah Teck","1 Happy Ave");
            printable.print();
            break;
            case "Teacher":
                printable = new Teacher("Paul Tan","Ahunbaeva 128");
                printable.print();
                break;
            case "Administrator":
                printable = new Administrator("Nurgazy",  "'10 mkrn ");
                printable.print();
        }
        return  printable;
    }
}
