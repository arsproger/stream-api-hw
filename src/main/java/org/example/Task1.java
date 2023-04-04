package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> officeSupplies = new ArrayList<>();
        officeSupplies.add("Ручки");
        officeSupplies.add("Карандаши");
        officeSupplies.add("Кисти");
        officeSupplies.add("Маркеры");
        officeSupplies.add("Цветные карандаши");
        officeSupplies.add("Фломастеры");
        officeSupplies.add("Тетради");
        officeSupplies.add("Блокноты");
        officeSupplies.add("Ежедневники");
        officeSupplies.add("Клей");
        officeSupplies.add("Скотч");
        officeSupplies.add("Степлер");
        officeSupplies.add("Канцелярские кнопки");
        officeSupplies.add("Ластик");
        officeSupplies.add("Линейки");
        officeSupplies.add("Ножницы");

        officeSupplies.stream().filter(a -> a.startsWith("К")).forEach(a -> System.out.print(a + ' '));
    }
}
