import com.brunoyam.lesson4.Cat;

import java.util.Scanner;

public class Main {

    static void deleteNegativeFromArray() {
        int[] a = {1, -1, 4, 6, 10, -12};

        for (int i = 0; i < a.length; ++i) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }

        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }

    }

    static void sumNumberDigits() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String numberString = String.valueOf(a);

        int res = 0;

        for (int i = 0; i < numberString.length(); i++) {
            char ch = numberString.charAt(i);   // отдельный элемент строки - символ, поэтому символьная переменная
            String s1 = String.valueOf(ch);   // перевод символа в строку
            int b = Integer.parseInt(s1);    // метод перевода из строки в число требует СТРОКУ на входе

            res += b;    // прибавить к результату текущую цифру
        }

        System.out.println(res);
    }

    static void sumNumberDigitsMath() {   // посичтать сумму цифр числа математическим путем
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int res = 0;

        while (a != 0) {   // мы "обрезаем" число до тех пор, пока оно не станет равно 0
            res += a % 10;  // складываем последнюю цифру числа, полученную остатком от деления на 10
            a /= 10;  // "обрезаем" число - убираем самую правую цифру делением на 10
        }

        System.out.println(res);
    }


    public static void main(String[] args) {

        Cat tom = new Cat("black", 2);
        Cat vaska = new Cat("white", 1);
        Cat lalala = new Cat("ginger", 5);

        // System.out.println(tom.name);
        // System.out.println(tom.color);
        // System.out.println(tom.age);
        System.out.println(tom.toString());

        // System.out.println(vaska.name);
        // System.out.println(vaska.color);
        // System.out.println(vaska.age);

        Cat muhtar = new Cat("white", 6);

        int muhtarAge = muhtar.getAge();
        String name = muhtar.getName();
        String color = muhtar.getColor();

        muhtar.setAge(33);

        System.out.println(muhtar.toString());
//
//        lalala.meow();
//        tom.meow();


    }
}
