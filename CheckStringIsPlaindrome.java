
import java.util.*;
public class CheckStringIsPlaindrome {
	
	
	private static String checkPlaindromeOrNot(String s1)
	{
		
		/*
		 * substring()  :
		StringIndexOutOfBoundsException is thrown when any one of the following conditions is met.

		1. if the start index is negative value
		2. end index is lower than starting index.
		3. Either starting or ending index is greater than the total number of characters present in the string.
		
		*/
		String s2=s1.substring(s1.length()-1, 0);   //vijay
		return s2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String s1=sc.next();
		
		
		System.out.print(checkPlaindromeOrNot(s1));
		
		
	}

}
