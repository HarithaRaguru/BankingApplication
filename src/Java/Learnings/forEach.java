package Java.Learnings;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {1,2,3,4,5,5,6,67,98,9};
//		//for(data ype variable : arr){
//		//statements
//		//}
//		int sum = 0;
//		for(int value: arr) {
//			//System.out.println(value);
//			sum +=value;
//			
//			
//		}
//		
//		System.out.println(sum);
//		System.out.println(sum/arr.length);
//	}
		int [][] arr= {{1,2,3},{2,3,4},{4,5,6}};
		for(int[] SingleDimensionalArray: arr) {
			for(int Value:SingleDimensionalArray) {
				System.out.println(Value);
			}
		}
		
		
	
		
	}

}
