package com.live.interview;

/*
 * 👉👉 In this program we are going to check whether the string contains numeric digits or not
 * */

public class HowToCheckWhetherStringContainsNumericDigit
{
	
	// This method is developed to find whether the String contains numeric digits or not
		private static String checkWhetherTheStringContainsNumericDigitOrNot(String str) 
		{
			if(str.matches("[0-9.]+") && !str.equals("") && str!=null )
			{
				return str;
			}
			else
				return "String does not contain numeric values";
		}
		
	// Main Method
	public static void main(String[] args)
	{
		String str="12345";
		
		String result=checkWhetherTheStringContainsNumericDigitOrNot(str);
		System.out.println(result);
		
	}
		

}
