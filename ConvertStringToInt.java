package com.live.interview;

public class ConvertStringToInt 
{

	private static int numberFormatException(String str)
	{
		try
		{
			// Converting String to Integer
			int conversionFromStringToInt=Integer.parseInt(str);
			
			return conversionFromStringToInt;
		}
		catch (NumberFormatException nfe)
		{
			nfe.printStackTrace();
		}
		return 0; 
	}
	// Main Method
	public static void main(String[] args) 
	{
		//String str="NumberFormatException Demo";  //👉 This case will raise NumberFormatException as we are trying to convert String to an Integer.
		
		String str="23";
		int result=numberFormatException(str);    //👍🏻 This case will work fine. No NumberFormatException will be raised as we convert integer number to integer.
		System.out.println(result);
		
		
	}


}
