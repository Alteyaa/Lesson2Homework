package com.company;

public class Student extends Person implements Printable{

    // private instance variables
    private int numCourses;   // number of courses taken so far
    private String[] courses; // course codes
    private int[] grades;     // grade for the corresponding course codes
    private static final int MAX_COURSES = 30; // maximum number of courses


    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++ ) {
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }

    @Override
    public void print() {
        System.out.println(getName() + "'s address is " + getAddress());
    }
}
