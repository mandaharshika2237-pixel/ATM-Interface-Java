import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);

        int choice = 0;

        do {
            System.out.println("\n==============================");
            System.out.println("       ATM INTERFACE");
            System.out.println("==============================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
    choice = sc.nextInt();
} else {
    System.out.println("Invalid input! Please enter a number.");
    sc.next();
    continue;
}

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                   System.out.print("Enter amount to deposit: ₹");

if (sc.hasNextDouble()) {
    double deposit = sc.nextDouble();
    account.deposit(deposit);
} else {
    System.out.println("Invalid amount! Please enter a number.");
    sc.next();
}
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");

    if (sc.hasNextDouble()) {
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
    } else {
        System.out.println("Invalid amount! Please enter a number.");
        sc.next();
    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}