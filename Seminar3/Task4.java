package Seminar3;
/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    ArrayList<String> myList = new ArrayList<>();

    public void work() {
        myList.add("Hello");
        myList.add("Seminar");
        myList.add(String.valueOf(1));
        myList.add(String.valueOf(3));

        System.out.println("Первичный список " + myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().matches("\\b[\\d]+\\b")) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
