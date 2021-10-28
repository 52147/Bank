/**
 * Author : ShouTzu, Han
 * Class : CS200
 * Finish Date : 8/16/2021
 * Project : Assignment #14 Bank 
 */

/**
 * Requirement :
 * 
 * 1. Create an account object for Account # 65478 for Sue Smith which has a
 * current balance of $5045.45.
 * 
 * 2. Create a savings object for Account # 54432 for Doug Martin which has a
 * current balance of $1234 and earns a monthly interest of 1.1%.
 * 
 * 3. Use the appropriate toString methods for both accounts to output their
 * account details to the user in the console.
 * 
 * 4. Make a deposit of $365 to Sue・s account.
 * 
 * 5. Make a deposit of $125 to Doug・s account.
 * 
 * 6. Withdraw $125 from Sue・s account.
 * 
 * 7. Use the appropriate toString methods for both accounts to output their
 * account details to the user in the console.
 * 
 * 8. Print to the console the interest to be earned by Doug・s account.
 * 
 * 9. Credit the interest earned to Doug・s account. 
 */

/**  
 * Point:
 * 
 * = String format method= 
 * 
 * String.fornmat(format specifier, args): return the format String by using the specified locale, format string and arguments.
 * 
 * for example : 
 * 
 * If we need to let the double be the decimal type and keep the first two digits after the decimal point(rounding).
 * 
 * double/float -> use %.f
 * -> String.format("%.2f", 100.5555444444)
 * -> output: 100.56
 * 
 * 
 * = public static void main(String[] args) =
 * 
 * 1. public: - access modifier, which defines who can access this method.
 * 		      - public means every class can access this method.
 * 
 * 2. static: - identifies the class related things.
 * 		      - static means method or variable is class related rather object related.	
 * 		      - it can be accessed without creating a instance of the class(object).
 * 
 * 3. void :  - used to define the return type of the method.
 * 		      - void means the method does not return any value.
 * 
 * 4. main :    is the name of the method.
 * 
 * 5. String[] args : - is the parameter of the main method.
 * 				      - args contains the supplied command line arguments as an array of String object. 
 */

public class Driver {

	public static void main(String[] args) {

		Account account = new Account("Sue Smith", 65478, 5045.45);

		Savings savings = new Savings("Doug Martin", 54432, 1234, 0.0011);

		System.out.println();

		System.out.println(account.toString());
		System.out.println();
		
		System.out.println(savings.toString());
		System.out.println(savings.toString2());
		System.out.println();
		
		System.out.println("---------------------------------------");

		account.deposit(365);
		
		savings.deposit(125);

		System.out.println();
		
		System.out.println("-> Sue made a deposit of 365$.");

		System.out.println(account.toString());
		System.out.println();
		
		System.out.println("-> Doug made a deposit of 125$.");
		
		System.out.println(savings.toString());
		System.out.println(savings.toString2());
		System.out.println();
		
		System.out.println("---------------------------------------");

		account.withdrawal(125);

		System.out.println();
		
		System.out.println("-> Sue made a withdrawal of 125$.");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.println(savings.toString());
		System.out.println(savings.toString2());		
		System.out.println();
		
		System.out.println("---------------------------------------");
		
		System.out.println();

		savings.addInterest();

		System.out.println(account.toString());
		System.out.println();

		System.out.println("-> Add the interest to Doug 's account.");
		
		System.out.println(savings.toString());
		System.out.println(savings.toString2());
	}

}
