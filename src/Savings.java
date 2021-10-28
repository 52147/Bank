/**
 * Requirement:
 * 
 * 4. A computation method, named calculateInterest, that will calculate the
 * interest earned for the month by multiplying the rate by the account
 * balance. The method will return the interest amount to be earned for the
 * month to the caller.
 * 
 * 5. A computation method, named addInterest, that will calculate the
 * interest earned and add it to the balance. This method doesn't return
 * anything to the caller. 
 */

/**
 * Point :
 * 
 * = extends =
 * 
 * extends: inherit the method and attribute from parent class to child class.
 * 
 * for example: 
 * when you want the attribute and method that in Account class can be used in the Savings class
 * 
 * parent class -> Account class
 * child class -> Saving class
 * use extends keyword -> public class Savings extends Account 
 * 
 * = constructor =
 * 
 * constructor: 
 *  - constructor is the special method to initialize the object, it can be used to set the initial value for the object attributes.
 *  - constructor is called when the object is created.
 * 
 * For example:
 * Account account = new Account("Sue Smith", 65478 , 5045.45);
 * Account(attributes)
 *  
 * = super =
 * 
 * super : can invoke the superclass(parent class) constructor -> must be the first line of the subclass constructor 
 * 
 * = toString method =
 * 
 * toString :
 *  - All Object has the toString method. 
 *  - toString method can print the object.
 * 
 * For example:
 * 
 * If we want to print the attributes of the class and not use the toString method, we will get the hash code of the object.
 * 
 * 	Student grade = new Student("Mary", 100)
 * 	System.out.println(grade)
 * 
 * 	-> output: Student@1fee6fc (hash code)
 * 
 * 	When we use the toString method to print the object.
 * 
 * 	-> output: Mary 100
 * 
 * = hash code =
 * 
 * hash code :
 *  - hash code is an integer value that is associated with each objects.
 *  - hash code purpose is to facilitate hashing in hash table and hash map.
 *  - hashing means use a function that map keys to values.  	
 */


// Account is the parent class
// Saving is the child class
public class Savings extends Account {

	private double rate;

	public Savings(String accountOwnerName, int accountNumber, double balance, double rate) {
		// super keyword refer to the superclass(parent class) objects
		super(accountOwnerName, accountNumber, balance); // superclass constructor: must be the first line of the
															// subclass constructor
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double value) {
		rate = value;
	}

	public double calculateInterest() {
		return (super.getBalance() * rate);
	}

	public void addInterest() {
		super.deposit(calculateInterest());
	}

	public String toString2() {
		return "Rate : " + getRate() + "\nInterest : " + String.format("%.4f", getBalance() * getRate()) + "$";
	}

}
