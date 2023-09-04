import java.util.Scanner;

public class DynamicBudgetTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0; // Initialize the initial balance to 0

        // Display a welcome message
        System.out.println("Welcome to the Dynamic Budget Tracker!");

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount in rupees: ");
                    double income = scanner.nextDouble();
                    balance += income;
                    System.out.println("Income added successfully.");
                    break;

                case 2:
                    System.out.print("Enter expense amount in rupees: ");
                    double expense = scanner.nextDouble();
                    if (expense <= balance) {
                        balance -= expense;
                        System.out.println("Expense added successfully.");
                        System.out.println("You spent Rs. " + expense + " today.");
                    } else {
                        System.out.println("Insufficient balance. Cannot add expense.");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is Rs. " + balance);
                    break;

                case 4:
                    System.out.println("Exiting the Budget Tracker. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
