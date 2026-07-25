public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn: ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}