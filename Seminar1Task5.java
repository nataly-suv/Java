
import java.util.Scanner;

/*===================================
 * 
 * Реализовать простой калькулятор
 * 
 ==================================*/

public class Seminar1Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введите 2 числа через пробел");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print(
                "Какую математическую операцию вы хотите произвести: \n сложение - sum \n" +
                        " вычитание - minus \n умножение - mult \n деление - div \n Введите: ");

        String operation = sc.next();
        sc.close();

        double res = 0;

        if (operation.equals("sum")) {
            res = x + y;
            System.out.println(res);
        } else if (operation.equals("minus")) {
            res = x - y;
        } else if (operation.equals("mult")) {
            res = x * y;
        } else if (operation.equals("div")) {
            res = x / y;
        }

        System.out.println(operation);

        System.out.println(res);
    }

}




