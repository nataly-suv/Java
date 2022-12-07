package DZ4;
/*
 * 
 * Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 * 
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {

    // результирующий метод
    public void solution() {
        LinkedList<String> inQueue = fillQueue(); // заполняем очередь

        System.out.println("Что необходимо сделать:" +
                " \n1 - добавить элемент в конец очереди " +
                " \n2 - вернуть первый элемент и удалить его" +
                " \n3 - вернуть первый элеемнт, не удаляя его");
        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        //input.close(); // нельзя закрывать, а то не сработает сканер в методе 1

        if (operation.equals("1")) {
            addQueue(inQueue);
        } else if (operation.equals("2")) {
            dellQueue(inQueue);
        } else if (operation.equals("3")) {
            firtQueue(inQueue);
        } else {
            System.out.println("Вы ввели неправильную оперецию");
        }

    }

    // Метод заполнения очереди
    public LinkedList<String> fillQueue() {

        LinkedList<String> outQueue = new LinkedList<>();
        String inDate;
        System.out.println("Введите эдементы очереди. При завершении введите букву Q");

        do {
            Scanner in = new Scanner(System.in);
            inDate = in.next();

            if (!inDate.equals("Q")) {
                outQueue.add(inDate);
            }

        } while (!inDate.equals("Q"));
        System.out.println("Исходная очередь: " + outQueue);

        return outQueue;
    }

    // метод добавления элемента в конец очереди
    public void addQueue(LinkedList<String> inQueue) {
        System.out.print("Введите элемент, который хотите добавить в конец очереди: ");
        Scanner in = new Scanner(System.in);
        String temp = in.next();
        inQueue.add(temp);
        in.close();
        System.out.println(inQueue);
    }

    // возвращает первый элемент из очереди и удаляет его
    public void dellQueue(LinkedList<String> inQueue) {
        String temp = inQueue.removeFirst();
        System.out.println("Первый элеемнт в очереди: " + temp);
        System.out.println("Очередь после выполнения операции: " + inQueue);
    }

    // возвращает первый элемент из очереди, не удаляя
    public void firtQueue(LinkedList<String> inQueue) {
        String temp = inQueue.getFirst();
        System.out.println("Первый элеемнт в очереди: " + temp);
        System.out.println("Очередь после выполнения операции: " + inQueue);
    }

}
