/*
 * Напишите метод, который принимает на вход строку (String) и 
 * определяет является ли строка палиндромом (возвращает boolean значение).
 * 
 */

import java.util.Scanner;

public class Seminar2Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        in.close();
        System.out.println(isPalindrom(string));
    }

    public static boolean isPalindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }

}
