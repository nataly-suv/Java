package DZ5;
/*
 * 
 * Пусть дан список сотрудников:Иван Иванов 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.RowSorter.SortKey;

public class Task2 {

    // результирующий метод
    public void solution() {
        ArrayList<String> staff = fillArray(); // получаем список
        HashMap<Integer, ArrayList<String>> sort = sortStaff(staff); // получаем отсортированную мапу
        System.out.println("\n Итоговый список: ");
        printSort(sort);

    }

    // заполняем список
    public ArrayList<String> fillArray() {
        ArrayList<String> staff = new ArrayList<>();
        staff.add("Петров");
        staff.add("Сидоров");
        staff.add("Петров");
        staff.add("Иванов");
        staff.add("Захаров");
        staff.add("Сидоров");
        staff.add("Карманов");
        staff.add("Петров");
        staff.add("Суворов");
        staff.add("Карманов");
        staff.add("Петров");
        staff.add("Захаров");
        staff.add("Куминов");
        staff.add("Зверьков");
        staff.add("Царев");
        staff.add("Царев");

        return staff;
    }

    // Метод сортировки списка по количеству повторений и сохранее в мапу
    public HashMap<Integer, ArrayList<String>> sortStaff(ArrayList<String> staff) {
        HashMap<Integer, ArrayList<String>> sort = new HashMap<>();

        for (String person : staff) {

            int temp = Collections.frequency(staff, person); // частота встречания элемента в списке

            if (!sort.containsKey(temp)) {
                ArrayList<String> unic = new ArrayList<>();
                unic.add(person);
                sort.put(temp, unic);
                
            } else if (sort.containsKey(temp) && !sort.get(temp).contains(person)) {
                sort.get(temp).add(person);
            }

        }
        System.out.println("Мапа, полученная из списка: " + sort);
        return sort;
    }

    // метод вывода мапы в порядке убывания
    public void printSort(HashMap<Integer, ArrayList<String>> sort) {

        ArrayList<String> revers = new ArrayList<>(); // список, в которой собираю строки из key и value
        String string = ""; // строка для записи key и value

        for (Map.Entry<Integer, ArrayList<String>> entry : sort.entrySet()) { // беру пары key и value
            Integer key = entry.getKey(); // получаю key
            String key1 = String.valueOf(key);
            string = string + key1 + ": ";
            ArrayList<String> value = entry.getValue(); // получаю value (ArrayList)
            for (String valueInValue : value) { // перезаписываю элементы в ArrayList в строку
                string = string + valueInValue + " ";
            }
            revers.add(string); // добавляю стрку в новый ArrayList
            string = ""; // обнуляю строку

        }
        // печатаю ArrayList в обратном порядке
        for (int i = revers.size() - 1; i >= 0; i--) {
            System.out.println(revers.get(i));
        }

    }
}