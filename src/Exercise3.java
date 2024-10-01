import java.util.Scanner;

public class Exercise3 {
    int firstNumber=45;;
    int secondNumber=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Scanner scanner=new Scanner(System.in);
     System.out.println("What is the firstNumber:");
     int firstNumber=scanner.nextInt();
     System.out.println("What is the secondNumber:");
     int secondNumber=scanner.nextInt();
     Exercise3 Ex= new Exercise3();
     Ex.add();
     System.out.println("Result is "+ Ex.add());
	}
   public int add()
   {
	   this.firstNumber=firstNumber;
	   this.secondNumber=secondNumber;
	   return firstNumber+secondNumber;
	   //System.out.println("Result is "+ Ex.add());
   }
   
}
