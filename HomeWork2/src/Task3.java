import java.util.Scanner;

public class Task3 {

    public static void processInputTask3(Scanner scanner, Scanner scanner2, Scanner scanner3){
        System.out.print("Введите первое число: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите второе число: ");
        int secondNumber = Integer.parseInt(scanner2.nextLine());

        System.out.print("Введите третье число: ");
        int thirdNumber = Integer.parseInt(scanner3.nextLine());

        try {
            checkNumbersInRange(firstNumber, secondNumber);
            checkSumIsLargeEnough(firstNumber, secondNumber);
            checkDivisionByZero(thirdNumber);
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число");
        }
    }
    private static void checkNumbersInRange(int firstNumber, int secondNumber) throws NumberOutOfRangeException {
        if (firstNumber > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (secondNumber < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    private static void checkSumIsLargeEnough(int firstNumber, int secondNumber) throws NumberSumException {
        if (firstNumber + secondNumber < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }

    private static void checkDivisionByZero(int thirdNumber) throws DivisionByZeroException {
        if (thirdNumber == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}
