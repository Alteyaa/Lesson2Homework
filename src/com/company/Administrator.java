package com.company;

public class Administrator extends Person implements Printable{

    private int mSalary;

    public Administrator(String name, String address) {
        super(name, address);
        mSalary = 30000;
    }

    @Override
    public void print() {

        System.out.println(mSalary + "You are salary");

    }
    public int getmSalary() {
        return mSalary;
    }
}
