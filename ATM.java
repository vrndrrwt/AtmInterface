import java.util.Scanner;

 

public class ATM {

    private double balance;

    private Scanner scanner;

 

    public ATM() {

        balance = 0.0;

        scanner = new Scanner(System.in);

    }

 

    public void run() {

        boolean exit = false;

 

        while (!exit) {

            System.out.println("ATM MENU");

            System.out.println("1. Check Balance");

            System.out.println("2. Deposit");

            System.out.println("3. Withdraw");

            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

 

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    checkBalance();

                    break;

                case 2:

                    deposit();

                    break;

                case 3:

                    withdraw();

                    break;

                case 4:

                    exit = true;

                    System.out.println("Thank you for using the ATM. Goodbye!");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");

                    break;

            }

            System.out.println();

        }

 

        scanner.close();

    }

 

    private void checkBalance() {

        System.out.println("Current Balance: $" + balance);

    }

 

    private void deposit() {

        System.out.print("Enter the amount to deposit: $");

        double amount = scanner.nextDouble();

        if (amount > 0) {

            balance += amount;

            System.out.println("Deposit of $" + amount + " successful.");

        } else {

            System.out.println("Invalid amount. Please try again.");

        }

    }

 

    private void withdraw() {

        System.out.print("Enter the amount to withdraw: $");

        double amount = scanner.nextDouble();

        if (amount > 0) {

            if (balance >= amount) {

                balance -= amount;

                System.out.println("Withdrawal of $" + amount + " successful.");

            } else {

                System.out.println("Insufficient balance. Please try again.");

            }

        } else {

            System.out.println("Invalid amount. Please try again.");

        }

    }

 

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.run();

    }

}
