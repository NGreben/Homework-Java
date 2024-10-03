import java.util.Scanner;

public class Homework1Task4 {
    public static void main(String[] args) {
        // Задача 4*. Нахождение максимального из трех чисел
        // Реализуйте две функции:
        // 1. Функция findMaxOfTwo должна принимать два числа и возвращать
        // максимальное из них, используя только знак сравнения.
        // 2. Функция findMaxOfThree должна принимать три числа и находить
        // максимальное из них, используя первую функцию.
        Scanner iScanner = new Scanner(System.in);

        System.out.println(
                "Будет найдено максимальное из двух чисел: a и b. И максимальное из трёх чисел: a, b и c \nВведите первое число a:");
        int a = iScanner.nextInt();
        System.out.println("Введите второе число b:");
        int b = iScanner.nextInt();
        System.out.println("Введите третье число c:");
        int c = iScanner.nextInt();
        System.out.println("Максимальное из двух чисел равно: ");
        System.out.println(findMaxOfTwo(a, b));
        System.out.println("Максимальное из трёх чисел равно:");
        System.out.println(findMaxOfThree(a, b, c));

        iScanner.close();
    }

    public static int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}
