/*7.    Create a SavingsAccount class. Use a static data member annual Interest Rate to store the annual interest rate for each of the savers. Each member of the class contains a private data member
savingsBalance indicating the amount the saver currently has on deposit. Provide member function calculateMonthlyInterest() that calculates the monthlyinterest by multiplying the balance by annualInterestRate
divided by 12; this interest should be added to savingsBalance. Provide a static member function modifyInterestRate() that sets the static annualInterestRate to a new value. Write a driver program to
test class SavingsAccount. Instantiate two different objects of classSavingsAccount, saver1 and saver2, with balances of
2000.00 and 3000.00,respectively. Set the annualInterestRate to
3 percent. Then calculate the monthlyinterest and print the new balances for each of the savers. Then set
The annualInterestRate to 4 percent, calculate the next month's interest and print the new balances for each of the savers.*/

package myPackage;

class SavingsAccount {
	private static double annualInterestRate; // Static member for annual interest rate
	private double savingsBalance; // Instance member for balance

	// Constructor to initialize savings balance
	public SavingsAccount(double balance) {
		this.savingsBalance = balance;
	}

	// Method to calculate monthly interest
	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest; // Add interest to the balance
	}

	// Static method to modify the annual interest rate
	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}

	// Method to get the current balance
	public double getSavingsBalance() {
		return savingsBalance;
	}
}
