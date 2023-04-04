package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //  Существует список названий книг -> отсортировать их в алфавитном порядке
        List<String> bookTitles = new ArrayList<>();
        bookTitles.add("Преступление и наказание");
        bookTitles.add("Мастер и Маргарита");
        bookTitles.add("Война и мир");
        bookTitles.add("1984");
        bookTitles.add("Улисс");
        bookTitles.add("Три товарища");
        bookTitles.add("Повелитель мух");
        bookTitles.add("Гордость и предубеждение");
        bookTitles.add("Джейн Эйр");
        bookTitles.add("Атлант расправил плечи");
        bookTitles.add("Над пропастью во ржи");
        bookTitles.add("Американский психопат");
        bookTitles.add("Братья Карамазовы");
        bookTitles.add("Алхимик");
        bookTitles.add("Думай медленно... решай быстро");

        bookTitles.stream().sorted().forEach(System.out::println);
    }
}
