package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
//        Есть список целочисленных значений. Вывести на экран числа, значения которых больше 100

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            int number = random.nextInt(101) + 50;
            numbers.add(number);
        }

        numbers.stream().filter(x -> x > 100).forEach(System.out::println);
    }
}
