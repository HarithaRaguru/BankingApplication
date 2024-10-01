import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("How many marks secured in the exam");
		int marks=sc.nextInt();
		if(marks <35)
	
		{
			System.out.println("The student got failed in the Exam");
		}
		else if(marks <74 && marks>35)
		{
			System.out.println("The Student secured second Rank");
		}
		else if (marks ==35)
		{
			System.out.println("The student is just passed");
		}
		else
		{
          System.out.println("The student got first Rank");
		}

	

	}

}
