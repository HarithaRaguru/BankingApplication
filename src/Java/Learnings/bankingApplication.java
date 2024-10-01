package Java.Learnings;

import java.util.Scanner;

public class bankingApplication {
	static int balance=1000;
	Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		int option = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to axis Bank,please continue with the below option");
		while(option!=7) {
			System.out.println("1.account creation");
			System.out.println("2.accountDetails of the customer");
			System.out.println("3.Deposit the amount to the account");
			System.out.println("4.withdrawal of the amount from the account");
			System.out.println("5.check balance");	
			System.out.println("6.Exit");
            option=sc.nextInt();
			bankingApplication BA=new bankingApplication();
			switch(option) {


			case 1:
				accountCreation();
				break;
			case 2:
				accountDetails();
				break;
			case 3:
				deposit();
				break;	
			case 4:
				BA.withdrawal();
				break;
			case 5:
				checkCurrentBalance();
				break;
			case 6:
				BA.exit();
				break;
			default :
				System.out.println("Please give corect option as per the menu");
				break;


			}
		}
	}


	public static void accountCreation() {
		try {
		System.out.println("Welcome to the Bank");
		Scanner sc= new Scanner(System.in);
		System.out.println("would you like to open the bank account");
		String response= sc.nextLine();


		System.out.println("1.Savings Account");
		System.out.println("2.Zero Account");
		System.out.println("3.Salary Account");
		System.out.println("Please Enter the Customer Name:");
		String nameAccountHolder= sc.nextLine();
		System.out.println("Please Enter the Customer age:");
		int ageOfAccountHolder=sc.nextInt();
		System.out.println("Please Enter the Customer Id:");
		long customerIdNumber=sc.nextLong();
		System.out.println("Account got created succeessfully for the customer "+nameAccountHolder );
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		} 
		}
		
	private static void accountDetails() {
		System.out.println("Welcome to the Axis Bank,please give the Ac_no");
		Scanner sc= new Scanner(System.in);
		long Ac_No=sc.nextLong();
		System.out.println("Thanks for the details,please find your account " +Ac_No);


	}


	public static void deposit ( ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the amount to deposit");
		int amount= sc.nextInt();
		balance =balance+amount;
		System.out.println("Total Amount is " +balance);
	}


	public void withdrawal() {
		System.out.println("Please enter the amount to withdrawal");
		Scanner sc= new Scanner(System.in);
		int amount1=sc.nextInt();
		if(balance>amount1) {
			balance =balance-amount1;
			System.out.println("Balance is :"+balance);
		}else {
			System.out.println("Balance is low :"+balance);
		}
	}


	public static void checkCurrentBalance() {
		System.out.println("Current balance is" +balance);
	}


	public void exit() {
		System.out.println("Thanks for choosing Axis Bank,see you");


	}





}
 