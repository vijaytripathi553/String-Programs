package com.live.interview;

public class HowToCheckWhetherStringIsNullOrEmpty 
{
	
	// Method to check whether it contains Null or Empty string
	private static String checkNullOrEmpty(String str)
	{
		try
		{
			if(str.isEmpty())
			{
				return "String is empty";
			}
			else if(str==null)
			{
				return "String is null";
			}
			else
				return "String is neither empty nor null ! It is fine";
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
			System.out.println("String is null");
		}
		return "";
			
		}
		
	// Main method
	public static void main(String[] args) 
	{
		String str=null;
		//String str="efe";
		String result=checkNullOrEmpty(str);
		System.out.println(result);
		
	}

	

}
