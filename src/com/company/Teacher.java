package com.company;

public class Teacher extends Person implements Printable {


    private int numCourses;   // number of courses taught currently
    private String[] courses; // course codes
    private static final int MAX_COURSES = 5; // maximum courses


    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];

    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    @Override
    public void print() {
        System.out.println(getName() + "'s address is " + getAddress());
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course : courses) {
            if (addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for (String course : courses) {
            if (removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }

        }
    }
    public boolean addCourse(String course) {

        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        boolean found = false;

        int courseIndex = -1;  // need to initialize
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                courseIndex = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = courseIndex; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }
    }
}