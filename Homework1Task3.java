import java.util.Scanner;

public class Homework1Task3 {
    public static void main(String[] args) {
        // Задача 3. Подсчет суммы цифр числа
        // Напишите метод sumDigits, который принимает целое число n и возвращает
        // сумму его цифр.
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = iScanner.nextInt();
        int result = 0;
        while (n != 0) {
            result = result + n % 10;
            n /= 10;
        }
        System.out.println(result);

        iScanner.close();
    }

}
