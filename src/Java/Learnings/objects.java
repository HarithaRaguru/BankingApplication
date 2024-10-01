package Java.Learnings;

public class objects {
	 int i;
	 int j;

	public objects() {
		i=10;
		j=0;
		// TODO Auto-generated constructor stub
	}
	public objects(int i ,int j) {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.j=j;
		//System.out.println(i);
		//System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   objects ob= new objects();//objects()-It is an constructor
   objects ob1= new objects(10,20);
   System.out.println(ob1.add());
 //  System.out.println(ob.add());
	}
//   System.out.println(ob.hashCode());//To get the memory of the object
//   System.out.println(ob1.hashCode());
   public int add()
   {return i+j;
		   }
   }


