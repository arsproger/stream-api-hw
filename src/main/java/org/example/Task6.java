package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
//        Список состоит из 4 строк.
//        Получить одну строку путем склеивания строк из списка, разделяя их точкой заяпятой

        List<String> strings = new ArrayList<>(Arrays.asList("строка 1", "строка 2", "строка 3", "строка 4"));

        strings.stream().map(x -> x + "; ").forEach(a -> System.out.print(a + ' '));

    }
}
