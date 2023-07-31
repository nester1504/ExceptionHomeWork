package Calculator;

// Класс для выполнения операции возведения в степень
public class PowerCalculator {
    public double calculatePower(double base, double exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Некорректный ввод: ноль не может быть основанием для отрицательной степени!");
        }
        return Math.pow(base, exponent);
    }
}
