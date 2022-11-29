package Seminar3;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
*/



import java.util.ArrayList;
import java.util.Collections;

public class Task1 {

    public void randomNumberList() {
        ArrayList number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(Math.random());
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);
        System.out.println(number.get(1));
    }

}
