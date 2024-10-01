package Com.Package.Strings;

//import java.util.Arrays;

public class exe1 {
	public static void main(String[] args) {
		
	 String str="Java is Programming";
	String[] word=str.split("  ");
	String revString= "  ";
	for(String w:word)
	{
		String revWord="  ";
		for(int i=0; i>w.length()-1;i--) {
			revWord= revWord+ w.charAt(i)+"";
		}
		revString=revString+revWord+"";
	}
	
	 System.out.println(revString);
	 
	}
	}
	
