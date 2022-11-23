import java.util.Scanner;

/*==============================================================================================
 * 
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * 
 ==============================================================================================*/

public class Seminar1Task3 {
    public static void main(String[] args) {
        System.out.print("Введите положительное число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int countSum = 0;
        int countMult = 1;
        for (int i = 1; i < n + 1; i++) {
            countSum += i;
            countMult *= i;
        }
        System.out.println("n-ое треугольное число равно: " + countSum);
        System.out.println("факториал n равен: " + countMult);
    }
}


