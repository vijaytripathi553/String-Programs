import java.util.Arrays;

public class ReverseStringThroughForLoop {
	
	public static void main(String[] args) {
		String s1="Raghav";
		
		// Converting String s1 into array
		String s2[]=s1.split("");
		
		// Now we can iterate over array
		for (int i = s2.length-1; i >=0; i--) {
			System.out.print(s2[i]);
			
		}
		
		String s3=Arrays.toString(s2);
		System.out.println(s3);
		
		
	}
}