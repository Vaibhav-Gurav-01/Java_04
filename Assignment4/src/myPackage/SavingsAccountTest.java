package myPackage;

public class SavingsAccountTest {
    public static void main(String[] args) {
        // Set the annual interest rate to 3%
        SavingsAccount.modifyInterestRate(0.03);

        // Create two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Calculate monthly interest for the first month
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print new balances after the first month
        System.out.printf("Saver 1 Balance after 1 month: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 Balance after 1 month: $%.2f%n", saver2.getSavingsBalance());

        // Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate monthly interest for the second month
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print new balances after the second month
        System.out.printf("Saver 1 Balance after 2 months: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 Balance after 2 months: $%.2f%n", saver2.getSavingsBalance());
    }
}
