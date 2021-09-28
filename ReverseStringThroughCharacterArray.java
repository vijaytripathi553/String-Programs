
public class ReverseStringThroughCharacterArray {
	public static void main(String[] args) {
		
		String s1="Vijay";  //5
		
		char array1[]=s1.toCharArray();
		
		for (int i = array1.length-1; i>=0; i--) {
			System.out.print(array1[i]);
			
		}
	}

}
