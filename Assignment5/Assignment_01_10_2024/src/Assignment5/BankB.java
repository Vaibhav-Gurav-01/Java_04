package Assignment5;

public class BankB extends Bank {

	private int balance;
	protected double intrest=8.5;

	public BankB() {
		balance=1500;
	}

	public void bal() {
		System.out.println("Bank B balance: "+balance);
	}
	
	public double applyIntrest() {
		double newIntrest = super.applyIntrest()*balance;
		System.out.println("Intrest Ammount in BankB : "+newIntrest);
		return newIntrest;
		
		
	}
}
