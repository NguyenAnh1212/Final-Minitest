package com.anh.model;

public class Student {
    int id;
    String firstName;
    String lastName;
    int Class_id;

    public Student(int id, String firstName, String lastName, int class_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Class_id = class_id;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClass_id() {
        return Class_id;
    }

    public void setClass_id(int class_id) {
        Class_id = class_id;
    }
}
