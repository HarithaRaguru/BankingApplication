package Java.Learnings;

import java.util.Scanner;

public class DecisionMaking {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("what is your online assesmant");
		String examStatus=scanner.nextLine();
		if(examStatus=="Pass")
		{
			System.out.println("wait for the next round");
			String round1Status = "Pass";
			if(round1Status== "Pass");{
				System.out.println("You have cleared the round1 , wait for the next round");
				String round2Status= "Pass";
				if(round2Status=="Pass");{
					System.out.println("You have cleared the round 2, wait for the HR round");
				}


			}
          
		}
		else {
			System.out.println("You can go home");
	}
}
}



