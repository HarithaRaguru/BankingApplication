package Java.Learnings;

public class Varibles {
	 //Instance variables
	static int id=1089078 ;// Instance Variable-needs to call the 
	//object to execute in the method
	static int gh=7890;// Class Variable or  Static variable
	String name= "haritha";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varibles student=new Varibles();
		int height=70; //Local variable
	System.out.println(student.id);
	System.out.println(student.name);
	System.out.println(gh);
    System.out.println(height);
	more(90);
	more(89);// Parameter variable
	more(9);
	}
	public static void more(int height)// Parameter variable
	{
		//int height1=70;
		System.out.println(height);
		System.out.println(id);
	}
	public static void namingConvention()// Parameter variable
	{
		String name="haritha";
		String NAME="tiger";//(1)Case sensitive
		int i=78;// if the variable name is in single letter, it should be small
		////Camel Case: if the variable name has two words the first word should
		//be small letter and the second word starting letter should be capital 
		String firstName="h";//Camel case
		double MATH_PI=3.14;// here PI is an constant so it should be in capital
	
	}
	
	
}
 