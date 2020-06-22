package com.brunoyam.lesson4;

public class Dog extends Animal {


    void woaf() {
        System.out.println(this.getName()  + "says WOAF");
    }

    @Override
    public String toString() {
        return "Hello, my name is " + this.getName() + ". I am " + this.getAge() + " and i have " + this.getColor() + " fur";
    }
}
