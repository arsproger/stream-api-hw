package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
//        Есть список объектов с полями "email" и "sendStatus".
//        Поле "sendStatus" имеет два значения "SEND" и "NEW".Вытащить список объектов со статусом "NEW".

        List<Email> emails = new ArrayList<>();
        emails.add(new Email("test1@example.com", "NEW"));
        emails.add(new Email("test2@example.com", "SEND"));
        emails.add(new Email("test3@example.com", "NEW"));
        emails.add(new Email("test4@example.com", "SEND"));

        emails.stream().filter(x -> x.getSendStatus().equals("NEW")).forEach(System.out::println);
    }
}
