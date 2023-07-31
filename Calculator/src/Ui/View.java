package Ui;

import java.util.Scanner;

class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    // Метод для получения числа от пользователя
    public double getInputNumber() {
        return scanner.nextDouble();
    }

    // Метод для получения оператора от пользователя
    public char getOperator() {
        return scanner.next().charAt(0);
    }

    // Метод для вывода результата на экран
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    // Метод для вывода сообщения об ошибке на экран
    public void displayError(String message) {
        System.out.println("Ошибка: " + message);
    }
}