import java.util.Scanner;

public class Seminar1Task5Var2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через пробел");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();
        
        Solve operation = new Solve();
        double otvet = operation.solutions(x, y);
        System.out.println(otvet);

    }
}

class Solve {
    String operation;
    double res=0;

    Solve() {
        System.out.println(
                "Какую математическую операцию вы хотите произвести: \n сложение - sum \n" +
                        " вычитание - minus \n умножение - mult \n деление - div \n Введите: ");
        Scanner in = new Scanner(System.in);
        operation = in.next();
        in.close();
    }

    double solutions(double x, double y) {
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
        return res;

    }
}