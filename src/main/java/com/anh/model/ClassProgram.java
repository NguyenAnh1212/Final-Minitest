package com.anh.model;

public class ClassProgram {
    int id;
    String name;
    String description;

    public ClassProgram(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ClassProgram(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ClassProgram() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
