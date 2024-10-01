package Java.Learnings;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i=10;
     int j=30;
     System.out.println(i+j);//Arithmetic Operator
     System.out.println(i-j);//Arithmetic Operator
     System.out.println(i*j);//Arithmetic Operator
     System.out.println(i/j);//Arithmetic Operator
     System.out.println(i%j);//Arithmetic Operator
     
     //unary operator
     System.out.println(++i);//Pre increment
     System.out.println(i++);//Post Increment
     System.out.println(i);
     System.out.println(--j);//Pre decrement
     System.out.println(j--);;//post decrement
     System.out.println(j);
     
     //Reletional Operator
     System.out.println(i==j);//equals to
     System.out.println(i!=j);//not equals to
     System.out.println(i>j);//greater than
     System.out.println(i<j);//less than
     System.out.println(i<=j);//less than or equals to
     System.out.println(i>=j);//greater than or equals to
     
     //Conditional Operator
     System.out.println(i<j || i==j);// Or Operator
    System.out.println(i>j && i==j);//and operator
    
    //Assignment Operator
    i +=5;
    System.out.println(i);// adding value to the i only
    i -=6;
    System.out.println(i);// subtracting value from the i
    // like wise *,/,% 
    
	}

}
