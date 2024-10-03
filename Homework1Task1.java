import java.util.Scanner;

public class Homework1Task1 {
    // Задание 1. Нахождение факториала числа
    // Напишите метод factorial, который принимает число n и возвращает его
    // факториал. Если число n < 0, метод должен вернуть -1.

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = iScanner.nextInt();
        int result = 1;
        if (n < 0) {
            System.out.println("-1");
        } else {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
        }
        iScanner.close();
    }
}
