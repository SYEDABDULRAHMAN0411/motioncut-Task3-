import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker expenseTracker = new ExpenseTracker();

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expenses");
            System.out.println("4. View Category Total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter expense amount: $");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter expense category: ");
                    String category = scanner.nextLine();

                    expenseTracker.addExpense(description, amount, category);
                    break;
                case 2:
                    expenseTracker.viewExpenses();
                    break;
                case 3:
                    System.out.println("Total Expenses: $" + expenseTracker.getTotalExpenses());
                    break;
                case 4:
                    System.out.print("Enter category to view total: ");
                    String selectedCategory = scanner.nextLine();
                    System.out.println("Total for category '" + selectedCategory + "': $"
                            + expenseTracker.getCategoryTotal(selectedCategory));
                    break;
                case 5:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
