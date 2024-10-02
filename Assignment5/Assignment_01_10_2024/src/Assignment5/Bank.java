package Assignment5;

public class Bank {

	protected double balance;
	protected static double intrest=0.05;

	public Bank() {
		balance = 0;
		//intrest = 8.5;

	}

	public void getBal() {

		System.out.println("Original Balance :" + balance);
	}

	public double applyIntrest() {
		double d =balance*intrest;
		return d;
		
	}
}
