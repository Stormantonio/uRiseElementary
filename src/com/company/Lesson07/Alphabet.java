package com.company.Lesson07;

/**
 * Created by Anton on 22.11.2016.
 * Вывести в консоль, номера кириллических  символов (то есть русских, привычных нам)
 */
public class Alphabet {
    public static void main(String[] args) {
        char a = 'а';
        char z = 'я';

        System.out.println("Числа, соответствующие кириллическому алфавиту:");
        for (int i = (int) a; i <= (int) z; i++) {
            System.out.println(((char) (i)) + " = " + i);
        }
    }
}
