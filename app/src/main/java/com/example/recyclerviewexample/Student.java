package com.example.recyclerviewexample;

public class Student {
    private String xlastName;
    private String xfirstName;
    private int xidNumber;
    private String xcourse;
    private int xyear;

    public Student (String lastName,String firstName, int idNumber, String course, int year)
    {
        this.xlastName = lastName;
        this.xfirstName = firstName;
        this.xidNumber = idNumber;
        this.xcourse = course;
        this.xyear = year;

    }

    public String getLastName() {
        return xlastName;
    }

    public String getFirstName() {
        return xfirstName;
    }

    public int getIdNumber() {
        return xidNumber;
    }

    public String getCourse() {
        return xcourse;
    }

    public int getYear() {
        return xyear;
    }
}
