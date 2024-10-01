package Java.Learnings;

public class switchStatement {
	public static void main(String [] args) {
		int i=1;//ased on the values it will update the statements
		switch(i)
		{
		case 1 :
			int j=3;
			switch(j) {
			case 1:
				System.out.println("This is the first statemnt");
				break;
				default:
				System.out.println("empty");
			}
			
		break;	
		

		case 2:
			System.out.println("This is the second statemnet");
			break;

		case 3:
			System.out.println("This is the Thirs staement");
			break;
		default:
			System.err.println("s the default statemnt");
			break;
		}


	}
	//switch(key)
	//{
	//case value:
	//	//statements 
	//	break;
	//	default:
	//		//statements
	//		break;
	//}
}

