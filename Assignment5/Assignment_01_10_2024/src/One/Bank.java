/*1.    Bob has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0 and another method ‘applyInterest’ which return the accountbalance. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. Override the method ‘applyInterest’ by adding the interest calculated with the Bank’s interest rate (Static variable for the Bank class). Call the method 'getBalance' and ‘applyInterest’ by the
Object of each of the three banks.*/
package One;

class Bank {
    static double interestRate = 0.03; // Static variable for interest rate (3%)

    public double getBalance() {
        return 0;
    }

    public double applyInterest() {
        return getBalance(); // Default returns the balance without interest
    }
}
