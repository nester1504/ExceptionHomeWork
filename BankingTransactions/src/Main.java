public class Main {
    public static void main(String[] args) {


        // Создаем два банковских счета
        BankAccount account1 = new BankAccount("1234567890", 1000.0);
        BankAccount account2 = new BankAccount("0987654321", 500.0);

        // Переводим средства со счета 1 на счет 2
        double transferAmount = 1300.0;
        try {
            account1.transferFunds(account2, transferAmount);
            System.out.println("Перевод успешно выполнен. Баланс на счете 1: " + account1.getBalance());
            System.out.println("Баланс на счете 2: " + account2.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}


