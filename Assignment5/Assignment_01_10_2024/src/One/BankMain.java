package One;

public class BankMain {
	public static void main(String[] args) {
		BankA bankA = new BankA(1000);
		BankB bankB = new BankB(1500);
		BankC bankC = new BankC(2000);

		// Printing balances and interest applied
		System.out.println("Bank A Balance: $" + bankA.getBalance());
		System.out.println("Bank A Balance with Interest: $" + bankA.applyInterest());

		System.out.println("\nBank B Balance: $" + bankB.getBalance());
		System.out.println("Bank B Balance with Interest: $" + bankB.applyInterest());

		System.out.println("\nBank C Balance: $" + bankC.getBalance());
		System.out.println("Bank C Balance with Interest: $" + bankC.applyInterest());
	}
}
