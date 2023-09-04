import java.util.Scanner;

public class SimpleBudgetTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0; // Initialize the initial balance to 0

        // Ask the user for income
        System.out.print("Enter your income in rupees: ");
        double income = scanner.nextDouble();
        balance += income;

        // Ask the user for expenses
        System.out.print("Enter your expenses in rupees: ");
        double expense = scanner.nextDouble();

        // Check if there's enough balance to cover the expense
        if (expense <= balance) {
            balance -= expense;
            System.out.println("You spent Rs. " + expense + " today.");
        } else {
            System.out.println("Insufficient balance. You cannot spend Rs. " + expense + " today.");
        }

        // Display the remaining balance
        System.out.println("Your remaining balance is Rs. " + balance);

        scanner.close();
    }
}
