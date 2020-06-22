package com.brunoyam.lesson4;

public class Animal {

    private String name;
    private String color;
    private int age;

    Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    Animal() {}

    public int getAge() {  // геттеры
        return age;
    }

    public void setAge(int age) { // сеттеры
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
