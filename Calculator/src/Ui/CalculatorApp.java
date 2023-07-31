package Ui;

import Calculator.*;

public class CalculatorApp {
    // Метод для запуска калькулятора
    public void run() {
        View view = new View();
        PowerCalculator powerCalculator = new PowerCalculator();

        try {
            // Запрос первого числа у пользователя
            System.out.print("Введите первое число: ");
            double num1 = view.getInputNumber();

            // Запрос операции у пользователя
            System.out.print("Введите операцию (+, -, *, /, ^): ");
            char operator = view.getOperator();

            // Проверка на допустимый символ операции
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '^') {
                throw new InvalidOperatorException("Некорректный символ операции: используйте только +, -, *, / или ^!");
            }

            // Запрос второго числа у пользователя
            System.out.print("Введите второе число: ");
            double num2 = view.getInputNumber();

            // Проверка на некорректные числа
            if (Double.isNaN(num1) || Double.isNaN(num2)) {
                throw new InvalidNumberException("Некорректное число");
            }

            double result = 0.0;

            // Выполнение выбранной операции или возведение в степень
            switch (operator) {
                case '+':
                    Addition addition = new Addition();
                    result = addition.calculate(num1, num2);
                    break;
                case '-':
                    Subtraction subtraction = new Subtraction();
                    result = subtraction.calculate(num1, num2);
                    break;
                case '*':
                    Multiplication multiplication = new Multiplication();
                    result = multiplication.calculate(num1, num2);
                    break;
                case '/':
                    Division division = new Division();
                    result = division.calculate(num1, num2);
                    break;
                case '^':
                    result = powerCalculator.calculatePower(num1, num2);
                    break;
                default:
                    view.displayError("Некорректная операция: используйте только +, -, *, / или ^!");
                    return;
            }

            // Вывод результата
            view.displayResult(result);
        } catch (InvalidInputException e) {
            // Обработка ошибок некорректного ввода
            view.displayError(e.getMessage());
        } catch (Exception e) {
            // Обработка других ошибок
            view.displayError("Ошибка ввода чисел или операции: " + e.getMessage());
        }
    }
}
