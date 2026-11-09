import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);
        System.out.print("Задание 1. Введите длину ребра куба: ");
        double a = input.nextDouble();
        if (a <= 0 || !Double.isFinite(a)) {
            System.out.println("Длина ребра должна быть положительной и конечной.");
        } else {
            System.out.println("Объём куба: " + (a * a * a));
        }
        System.out.print("Задание 2. Введите год: ");
        int year = input.nextInt();
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.println(leap ? "Год високосный" : "Год не високосный");
        System.out.print("Задание 3. Введите натуральное N: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("N должно быть больше нуля.");
        } else {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
                if (i == Integer.MAX_VALUE) break;
            }
            System.out.println("Сумма ряда: " + sum);
        }
    }
}
