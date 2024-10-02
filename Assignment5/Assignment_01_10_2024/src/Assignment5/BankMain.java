package Assignment5;

public class BankMain {

	public static void main(String[] args) {
		BankA banka=new BankA();
		banka.bal();
		banka.applyIntrest();
		
		System.out.println("--------------------");
		BankB bankb=new BankB();
		bankb.bal();
		bankb.applyIntrest();
		
		System.out.println("--------------------");
		BankC bankc=new BankC();
		bankc.bal();
		bankc.applyIntrest();
	
	}

}
