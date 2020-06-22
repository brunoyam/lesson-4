package com.brunoyam.lesson4;

import java.util.concurrent.*;

public class Cat extends Animal {

    String[] names = {"Tom", "Jerry", "Barsik", "Murzik", "Tishka", "Boris", "Tesla", "Sonya"};

    public String name;
    public String color;
    public int age;

    public Cat(String c, int a) {
        super();
        // c = black, a = 2
        int randomNum = ThreadLocalRandom.current().nextInt(0, names.length);  // рандомный индекс от 0 до длины массива

        this.name = names[randomNum];
        this.color = c;
        this.age = a;
    }

    void meow() {   // функции-методы классы - определенные действия над объектами
        System.out.println(this.name + " says MEOW");
    }

    @Override
    public String toString() {   // переопределяем родительский метод toString() класса Object. Для вызова окна наследуемых методов нажмите ctrl+o
        return "Hello, my name is " + this.name + ". I am " + this.age + " and i have " + this.color + " fur";
    }
}
