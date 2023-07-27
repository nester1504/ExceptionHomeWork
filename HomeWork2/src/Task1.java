import java.util.Scanner;

public class Task1 {
    public static void checkPositiveNumber(int scanner) throws InvalidNumberException {
        if (scanner <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }

    public static void processInput(Scanner scanner) {
        System.out.print("Введите положительное число: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            checkPositiveNumber(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число");
        }
    }
}


