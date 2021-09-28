import java.util.Iterator;

public class CheckStringPalaindrome {
	
	private static String checkP(String s1)
	{
		
		String s2[]=s1.split("");
		String result="";
		for (int i = s2.length-1; i >=0; i--) {
			
			result=result+s2[i];
			
		}
		String f=s1.equals(result)?"Yes":"No";
		
		return f;
	}
	public static void main(String[] args) {
		String s1="Ram";
		//System.out.println(checkP(s1));
		
		String total=checkP(s1);
		System.out.println(total);
	
	}

}

