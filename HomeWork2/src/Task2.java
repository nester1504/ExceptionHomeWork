import java.util.Scanner;

public class Task2 {

    public static void processInputTask2(Scanner scanner, Scanner scanner2) {
        System.out.print("Введите первое число: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите второе число: ");
        int num2 = Integer.parseInt(scanner2.nextLine());

        try {
            int result = divideNumbers(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число");
        }
    }

    public static int divideNumbers(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }
}
