package com.l3.gl.model;

public class User {
    private String name;
    private int age;

    // Constructor جديد
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters و Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
