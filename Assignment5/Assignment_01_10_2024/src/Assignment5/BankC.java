package Assignment5;

public class BankC extends Bank {
	private int balance;
	protected double intrest=9.5;

	public BankC() {
		balance=2000;
	}

	public void bal() {
		System.out.println("Bank C balance: " + balance);
	}
	
	public double applyIntrest() {
		double newIntrest = (super.applyIntrest()*balance);
		System.out.println("Intrest Ammount in BankC : "+newIntrest);
		return newIntrest;
		
		
	}

}
