
public class StringProgramFromHackerRank {
	
	
	private static void performAll(String s1,String s2)
	{
		
		//1.   Caculating Length
		int s3=s1.length();
		int s4=s2.length();
		
		System.out.println(s3+s4);
		
		//2. Checking Lexoco
		String dict=(s1.compareTo(s2)>0?"Yes":"No");
		System.out.println(dict);
		
		String cap1="";
		String s1Array[]=s1.split("");
		for (int i = 0; i < s1Array.length; i++) {
			 cap1=s1Array[0].toUpperCase()+s1.substring(1);
			
			
		}
		
		
		String s2Array[]=s2.split("");
		String cap2="";
		for (int i = 0; i < s2Array.length; i++) {
			
			cap2=s2Array[0].toUpperCase()+s2.substring(1);
			
		}
		System.out.println(cap1+" "+cap2);
	
		//System.out.println(s1Array);
		
		
		
		
	}
	public static void main(String[] args) {
		
		//String alphabetArray[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		
		String s1="hello";
		String s2="world";
		
		
		performAll(s1,s2);
		/*
		 * // Converting string s1 into array String s1Array[]=s1.split(""); for (int i
		 * = 0; i < alphabetArray.length; i++) { for (int j = i+1; j <
		 * alphabetArray.length; j++) {
		 * 
		 * if (alphabetArray[j] < alphabetArray[j+1]) {
		 * 
		 * } }
		 * 
		 * 
		 * }
		 * 
		 */
				
			
			
		
		
		
		}
		
	}

