import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for investment amount
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        // Prompt user for number of years
        System.out.print("Enter number of years: ");
        int numYears = scanner.nextInt();

        // Validate user input
        if (investmentAmount <= 0 || numYears <= 0) {
            System.out.println("Error: investment amount and number of years must be greater than 0");
        } else {
            // Calculate and display investment amount for each year
            double balance = investmentAmount;
            for (int i = 1; i <= numYears; i++) {
                balance += balance * 0.08;
                System.out.printf("Year %d: $%.2f\n", i, balance);
                System.out.println("Based on 8% interest Anually.");
            }
        }
    }
}
