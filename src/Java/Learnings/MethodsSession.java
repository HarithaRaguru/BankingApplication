package Java.Learnings;

public class MethodsSession {
 static int currentBalance =5000;
	public static void greetCustomer() {
		System.out.println("Hello, Welcome to the Banking Application ");
     
	}
public static void main(String[] args) {
	//If the method is Non static,needs to create the object in the main method and should calls the object
	MethodsSe0[y-ssion bank= new MethodsSession ();
	greetCustomer();
	System.out.println("Current Balance is :"+currentBalance);
	
    bank.deposit(500);//here bank is an object and deposit is an non-static method
   System.out.println(" Current balance is : "+MethodsSession.currentBalance); 
   // If the method is static,no needs to create the object to call the method, we can call the method simply in the main method
   withDrawal(900);// Here withdrawal is an static method, so called the method simply in to the main method
   bank.currentBalance();//here bank is an object and currentBalance is an non-static method
}

public void deposit( int amount)
{
	currentBalance = currentBalance +amount;
	System.out.println("Amount is deposited succeessfully");
}

public static void withDrawal(int amount)
{
	currentBalance = currentBalance -amount;
	System.out.println("Amount is withdrawal succeessfully  :" +currentBalance);
	}
// Here the return type should be int because the current balance is int data type
public int currentBalance() {
   return currentBalance;
}
}
