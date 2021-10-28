/**
 * Requirement :
 * 
 * 1. three private instance variables: accountOwner (String), accountNum (int)
 * and balance (double)
 * 
 * 4. A computation method, named deposit, that takes the deposit amount as a
 * decimal value for its argument. The method adds the deposit amount to the
 * account's balance. This method doesn't return anything to the caller.
 * 
 * 5. A computation method, named withdrawal, that takes the withdrawal amount
 * as a decimal value for its argument. The method subtracts the withdrawal
 * amount from the account's balance. This method doesn't return anything to the
 * caller.
 * 
 * 6. A toString method to return a string containing all information stored
 * about the account 
 */

public class Account {

	private String accountOwner;
	private int accountNumber;
	private double balance;

	public Account(String accountOwner, int accountNumber, double balance) {
		this.accountOwner = accountOwner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String value) {
		accountOwner = value;
	}

	public int getAccountNum() {
		return accountNumber;
	}

	public void setAccountNum(int value) {
		accountNumber = value;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double value) {
		balance = value;
	}

	public String toString() {
		String output = "Account Owner : " + getAccountOwner() + "\n" + "Account Number: # " + getAccountNum() + "\n"
				+ "Balance : " + getBalance() + "$";
		return output;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdrawal(double amount) {
		balance = balance - amount;
	}

	

}
