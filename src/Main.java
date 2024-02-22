import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое дробное число: ");
        double a = sc.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите второе дробное число: ");
        double b = sc2.nextDouble();

        System.out.println("Сумма чисел = " + String.format("%.4f", a + b));

    }
}
