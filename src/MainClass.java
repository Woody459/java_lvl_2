import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        String[] arr = {"Крот", "Соник", "Зарево", "Зарево", "Соник", "Соник", "Соник", "Зарево", "Соник", "Крот"};

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            Integer name = hm.get(arr[i]);

            hm.put(arr[i], name == null ? 1 : name + 1);
        }
        System.out.println(hm);

        System.out.println("--------");


        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", "8 930 778 90 01");
        phonebook.add("Zyzin", "8 904 789 89 61");
        phonebook.add("Ivanov", "8 930 679 55 67");
        phonebook.add("Zyzin", "8 904 789 777 27 18");
        phonebook.add("Ivanov", "8 930 657 98 33");

        phonebook.get("Zyzin");
        phonebook.get("Ivanov");


    }
}




