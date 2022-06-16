package com.live.interview;

/*
 ✔✔  In This program we are going to learn how to remove the space which is there in between the string
 
 **************
 INPUT : String str=	"Remove the space which is in between the string"
 **************
 *
 * **************
 OUTPUT : String str=	"Removethespacewhichisinbetweenthestring "
 **************
*/

public class HowToRemoveTheSpaceWichIsInBetweenTheString 
{
	
	
	// Method to remove the spaces between the string
	private static String removeTheSpaceBetweenTheString(String str)
	{
		str=str.replaceAll("\\s", "");      //👉 backward slash (\\s) is nothing but meta character which is in regular expression   to remove the white spaces 
		
		return str;							// It will return Removethespacewhichisinbetweenthestring
	}
	
	// Main Method
	public static void main(String[] args)
	{
		String str="Remove the whitespace which is in between the string";
		
		String result=removeTheSpaceBetweenTheString(str);
		System.out.println(result);
		
		
	}
	

}
