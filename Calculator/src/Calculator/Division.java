package Calculator;

// Класс для выполнения операции деления
public class Division {
    public double calculate(double num1, double num2) throws InvalidInputException {
        if (num2 == 0) {
            throw new InvalidInputException("Деление на ноль недопустимо!");
        }
        return num1 / num2;
    }
}