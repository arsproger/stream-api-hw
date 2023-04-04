package org.example;

import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
//        Есть список вещественных значений. Вывести на экран среднее значение

        List<Double> doubleList = Arrays.asList(1.0, 2.5, 3.14, 4.2, 5.7);

        System.out.println(doubleList.stream().mapToDouble(Double::doubleValue).average().orElse(0));
    }
}
