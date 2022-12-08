package DZ5;
/*
 * 
 * Написать метод, который переведет число из римского формата записи в арабский. 
 * Например, MMXXII = 2022 (правила см. во вложениях к уроку, где ссылка на репозиторий).
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    public void solution() {
        System.out.print("введите римское число: ");
        Scanner in = new Scanner(System.in);
        String inString = in.next();
        in.close();
        ArrayList<Character> numberRim = new ArrayList<>();
        for (int i = 0; i < inString.length(); i++) {
            numberRim.add(inString.charAt(i));

        }

        System.out.println(numberRim);

        ArrayList<Integer> numberRimInt = new ArrayList<>();

        for (int i = 0; i < numberRim.size(); i++) {
            if (numberRim.get(i).equals('I')) {
                numberRimInt.add(i, 1);
            } else if (numberRim.get(i).equals('V')) {
                numberRimInt.add(i, 5);
            } else if (numberRim.get(i).equals('X')) {
                numberRimInt.add(i, 10);
            } else if (numberRim.get(i).equals('L')) {
                numberRimInt.add(i, 50);
            } else if (numberRim.get(i).equals('C')) {
                numberRimInt.add(i, 100);
            } else if (numberRim.get(i).equals('D')) {
                numberRimInt.add(i, 500);
            } else if (numberRim.get(i).equals('M')) {
                numberRimInt.add(i, 1000);
            } else
                System.out.println("Вы ввели неправильное число");
        }
        System.out.println(numberRimInt);

        for (int i = 0; i < numberRimInt.size() - 1; i++) {

            if (numberRimInt.size() >= 2 && (numberRimInt.get(i).equals(5) && numberRimInt.get(i + 1).equals(5))
                    || (numberRimInt.get(i).equals(50) && numberRimInt.get(i + 1).equals(50))
                    || (numberRimInt.get(i).equals(500) && numberRimInt.get(i + 1).equals(500))) {
                System.out.println("Вы ввели неверное число");
            } else if (numberRimInt.size() == 1) {
                int temp = numberRimInt.get(0);
                System.out.println("Римское число " + inString + " соответствует арабскому " + temp);
            } else if (numberRimInt.size() == 2) {
                if ((numberRimInt.get(0) > numberRimInt.get(1)) || (numberRimInt.get(0).equals(numberRimInt.get(1)))) {
                    int temp = numberRimInt.get(0) + numberRimInt.get(1);
                    System.out.println("Римское число " + inString + " соответствует арабскому " + temp);
                } else {
                    int temp = numberRimInt.get(1) - numberRimInt.get(0);
                    System.out.println("Римское число " + inString + " соответствует арабскому " + temp);
                }
            } else if (numberRimInt.size() == 3) {
                if (numberRimInt.get(0).equals(numberRimInt.get(1))
                        && numberRimInt.get(1).equals(numberRimInt.get(2))) {
                    int temp = numberRimInt.get(0) + numberRimInt.get(1) + numberRimInt.get(2);
                    System.out.println("Римское число " + inString + " соответствует арабскому " + temp);

                }
            }
        }

    }

}
