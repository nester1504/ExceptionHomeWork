class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Метод для перевода средств на другой счет
    public void transferFunds(BankAccount targetAccount, double amount) throws InvalidAmountException, InsufficientFundsException {
        // Проверка на некорректную сумму перевода
        if (amount <= 0) {
            throw new InvalidAmountException("Некорректная сумма перевода");
        }

        // Проверка на недостаточно средств для перевода
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }

        // Выполнение перевода
        balance -= amount;
        targetAccount.deposit(amount);
    }

    // Метод для зачисления средств на счет
    public void deposit(double amount) {
        balance += amount;
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }
}
