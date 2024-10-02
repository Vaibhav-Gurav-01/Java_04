package Assignment5;

public class BankA extends Bank {

	private int balance;
	protected double intrest = 7.5;

	public BankA() {
		balance = 1000;

	}

	public void bal() {
		System.out.println("Bank A balance: " + balance);
	}

	public double applyIntrest() {
		double newIntrest = super.applyIntrest()*balance;
		
		System.out.println("Intrest Ammount in BankA : " + newIntrest);
		return newIntrest;

	}

}
