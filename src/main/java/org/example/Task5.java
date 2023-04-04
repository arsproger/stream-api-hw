package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
//        Содержится ли в списке сотрудник с именем "Бакыт"

        List<String> names = new ArrayList<String>();
        names.add("Айдана");
        names.add("Айбек");
        names.add("Бакыт");
        names.add("Айтурган");

        System.out.println(names.stream().anyMatch(x -> x.equals("Бакыт")));
    }
}
