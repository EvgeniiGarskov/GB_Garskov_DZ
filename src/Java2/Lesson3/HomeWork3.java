package Java2.Lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HomeWork3 {

    public static void main(String[] args) {

        /*
        1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
        вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.
        2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
        лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
        через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
        справочника.
         */

//         String[] countries = {"Россия", "Австралия", "Бангладеш", "Россия", "Египет", "Дания", "Люксембург", "США", "Италия", "Дания", "Германия", "Австралия", "Болгария", "Италия", "Бангладеш"};
//         System.out.println("Список стран: " + Arrays.toString(countries));

         //Уникальный список без дубликатов
//         Set<String> countriesList = new HashSet<>(Arrays.asList(countries));
//         System.out.println("Список стран без дубликатов: " + countriesList);

        //Подсчёт дубликатов
//        HashMap<String, Integer> map = new HashMap();
//        for (String country : countries) {
//            map.put(country, map.getOrDefault(country, 0) +1);
//        }
//        System.out.println("Подсчёт повторяющихся стран: " + map);

        //Второе задание
//        PhoneBook phoneBook = new PhoneBook();
//
//        phoneBook.add(937000111L, "Garskov");
//        phoneBook.add(937000222L, "Zagidullina");
//        phoneBook.add(937000333L, "Garskov");
//        phoneBook.add(937000444L, "Ivanov");
//        phoneBook.add(937000555L, "Sidorov");
//
//        phoneBook.get("Garskov");
//        phoneBook.get("Zagidullina");
    }
}
