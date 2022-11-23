
/*
 * 
 * +Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 *  
 */


/*
 * РАССМОТРЕЛА ЧАСТНЫЙ СЛУЧАЙ.
 * Для уравнения типа  2 + ?5 = 69 
 * Когда первый элемент - число, второй элемент - число с вопросом, и ответ - число 
 * Уравннеия типа: 
 * 2 + ? =69
 * 2 + ?5 = 69
 * 2 + 5? =69 
 */
 

public class Seminar1Task6 {

    public static void main(String[] args) {

        String data = "14 + ?5 = 69";

        String[] numbers = data.split(" ");

        String number1 = numbers[0];
        String number2 = numbers[2];
        int res = Integer.parseInt(numbers[4]);
        int check = 0;

        // блок когда первое число - число. например 2+?5=69
        if (isNumeric(number1)) {
            // блок когда второе число не число и состоит из одного ?. например 60+?=69
            if (!isNumeric(number2) && number2.length() == 1) {
                int temp = res - Integer.parseInt(number1);
                // проверяю что число состоит из одной цифры
                if (temp < 10) {
                    System.out.println("Решение уравнения: " + number1 + "+" + temp + "=" + res);
                    check = 1;
                }
                // блок когда второе число - не число и состоит из 2 эл-ов, по типу 5? или ?5
            } else if (!isNumeric(number2) && number2.length() == 2) {
                // если первый символ у второго числа - это число, по типу 5?
                if (Character.isDigit(number2.charAt(0))) {
                    int temp = Character.digit(number2.charAt(0), 10); // перевожу первый элемент в числе в цифру
                    for (int i = 0; i < 10; i++) {
                        int tempRes = (temp * 10 + i); // формирую число по типу 5? - 5*10 + i
                        // проверяю, что уравнение формируется
                        if (Integer.parseInt(number1) + tempRes == res) {
                            System.out.println("Решение уравнения: " + number1 + "+" + tempRes + "=" + res);
                            check = 1;
                        }
                    }
                    // если второй символ у второго числа - это число, по типу ?5
                } else if (Character.isDigit(number2.charAt(1))) {
                    int temp = Character.digit(number2.charAt(1), 10); // перевожу второй элемент в числе в цифру
                    for (int i = 1; i < 10; i++) {
                        int tempRes = (i * 10 + temp); // формирую число по типу ?5 - i*10 + 5
                        // проверяю, что уравнение формируется
                        if (Integer.parseInt(number1) + tempRes == res) {
                            System.out.println("Решение уравнения: " + number1 + "+" + tempRes + "=" + res);
                            check = 1;
                        }
                    }
                }
            }
        }
        if (check == 0) {
            System.out.println("решения нет");

        }

    }

    // метод проверки, является ли строка числом

    public static boolean isNumeric(String string) {
        int intValue;

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}




// КОММЕНТАРИИ ДЛЯ МЕНЯ (НА ЗАМЕТКУ)
// if (Character.isDigit(number1.charAt(0))) {
// System.out.println("первое число ");
// } else {
// System.out.println("нет");

// }

// Integer.parseInt(str)

// System.out.println(number1);
// System.out.println(number2);
// System.out.println(res);

// import java.util.regex.*;

// public class Seminar1Task5 {
// public static void main(String[] args) {
// Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
// Matcher matcher = pat.matcher("45.5saf -fg123 -18+");
// while (matcher.find()) {
// System.out.println(matcher.group());
// }
// ;

// }

// }
