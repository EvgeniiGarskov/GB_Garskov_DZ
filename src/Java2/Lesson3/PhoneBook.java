package Java2.Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//public class PhoneBook {
//
//    // private String surname;
//    // private long phoneNumber;
//    private HashMap<Long, String> phoneBook;
//
//    public PhoneBook() {
//        phoneBook = new HashMap<Long, String>();
//    }
//
//    public void add(Long phoneNumber, String surname) {
//        phoneBook.put(phoneNumber, surname);
//    }

//    public void get(String surname) {
//        //создаём список где будут храниться ключи(телефоны) у которых одинаковые значения (фамилии)
//        List<Long> keyList = new ArrayList<>();
//        //итерируемся по телефонному справочнику и с помощью метода entrySet() получаем все пары ключ-значение
//        for(Map.Entry<Long, String> entry : phoneBook.entrySet()) {
//            //если значение равно значению, которое мы передали, то добавляем ключ (телефон) в наш лист
//            if(entry.getValue().equals(surname)) {
//                keyList.add(entry.getKey());
//            }
//        }
//        System.out.println("Номер телефона под фамилией - " + surname + ": " + keyList);
//    }

    //Ещё один вариант метода get()
//    public void get(String surname) {
//        if (phoneBook.containsKey(surname)) {
//            System.out.println(phoneBook.get(surname));
//        } else {
//            System.out.println("Такой фамилии нет");
//        }
//    }
//}
