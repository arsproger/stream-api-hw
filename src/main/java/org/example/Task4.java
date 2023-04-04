package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
//        В списке хранятся все книги библиотеки которые были взяты читателями по несколько
//        раз(список с дубликатами).Вывести на консоль список книг без дубликатов.

        List<String> books = new ArrayList<>();
        books.add("Мастер и Маргарита");
        books.add("Преступление и наказание");
        books.add("1984");
        books.add("Война и мир");
        books.add("Три товарища");
        books.add("Повелитель мух");
        books.add("Гордость и предубеждение");
        books.add("Улисс");
        books.add("Джейн Эйр");
        books.add("Атлант расправил плечи");
        books.add("Над пропастью во ржи");
        books.add("Американский психопат");
        books.add("Братья Карамазовы");
        books.add("Алхимик");
        books.add("Думай медленно... решай быстро");

        // Добавление дубликатов
        books.add("Преступление и наказание");
        books.add("Война и мир");
        books.add("Улисс");
        books.add("Думай медленно... решай быстро");

        books.stream().distinct().forEach(System.out::println);
    }
}
