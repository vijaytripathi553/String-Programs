package com.live.interview;

public class HowToCheckWhetherStringContainsAlphabeticalCharacter
{
	
// Method to check whether string contains alphabetical char or not
	private static String checkWhetherItContainsAlphabeticalChar(String str)
	{
		str=str.replaceAll("\\s", "");  // It will remove all the whitespaces with the empty string . This has been done because if your string containd space in between the text then it is not Giving the expected result
		if(str.matches("^[a-zA-Z]*$") && !str.equals("") && str!=null)
		{
			return "Yes, String contains Alphabetical char and here is the String:"+str;
		}
		else
		{
			return "It does'nt contain Aplphabetical character";
		}
	}

	// Main Method
	public static void main(String[] args)
	{
		String str="Hello Programmer";
		String result=checkWhetherItContainsAlphabeticalChar(str);
		System.out.println(result);
		
	}

}
