package atmMain;

import java.util.Scanner;

class ATM {
    // Define a constant PIN
    private static int CORRECT_PIN = 1002;
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }
    public static int getCorrectPin() {
    	return CORRECT_PIN;
    }
    public void setCorrectPin(int pin) {
    	pin = CORRECT_PIN;
    }

    // Method to check the account balance
    public void getBalance() {
        System.out.println("The balance is\t" + balance);
    }

    // Method to deposit to the account
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            getBalance();
        } else {
            System.out.println("Insufficient balance to complete the transaction");
        }
    }
}

public class AtmMain {
    public static void main(String[] args) {
        // Create an ATM object with an initial balance of 4000
        ATM myATM = new ATM(4000.00);
        Scanner scanner = new Scanner(System.in);
        int pinAttempt;

        System.out.println("Welcome to the ATM services");
        System.out.print("Kindly enter your PIN:");

        pinAttempt = scanner.nextInt();

        if (verifyPin(pinAttempt)) {
            // If PIN is correct
            System.out.println("Correct PIN. You can now perform your desired transaction.");
            performTransaction(myATM, scanner); // Pass the scanner to the performTransaction method
        } else {
            System.out.println("Incorrect PIN. You cannot perform your transaction.");
            scanner.close(); // Close the scanner if PIN is incorrect
        }
    }

    // Method to verify the account PIN
    public static boolean verifyPin(int pinAttempt) {
        return pinAttempt == ATM.getCorrectPin();
    }

    // Method to perform ATM transaction
    public static void performTransaction(ATM myATM, Scanner scanner) {
        int choice;
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Make a Deposit");
            System.out.println("3. Make a Withdrawal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myATM.getBalance();
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    myATM.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    myATM.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close(); // Close the scanner when exiting the program
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
    }
}
