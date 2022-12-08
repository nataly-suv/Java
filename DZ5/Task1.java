package DZ5;
/*
 * 
 * Реализуйте структуру телефонной книги с помощью HashMap, 
 * учитывая, что 1 человек может иметь несколько телефонов.
 * 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public HashMap<Long, String> fillMap() {

        HashMap<Long, String> foneBook = new HashMap<>();
        foneBook.put(9265838485L, "Петров Иван");
        foneBook.put(9564561232L, "Петров Иван");
        foneBook.put(3265621326L, "Васильев Александр");
        foneBook.put(9875623125L, "Петрова Ольга");
        foneBook.put(98562315452L, "Петрова Ольга");
        foneBook.put(8524621322L, "Закиров Виктор");
        foneBook.put(7451254589L, "Захаров Сергей");

        return foneBook;
    }

    public void searchFone() {
        HashMap<Long, String> foneBook = fillMap();
        System.out.print("Введите фамилию для поиска: ");

        Scanner in = new Scanner(System.in, "Cp866");
        String secondName = in.nextLine();
        in.close();

        System.out.println("Телефонные номера абонента: ");

        for (Map.Entry<Long, String> foneNumber : foneBook.entrySet()) {
            if (foneNumber.getValue().equals(secondName)) {

                System.out.println(foneNumber.getKey());
            }
        }
    }

}
