package com.live.interview;

import java.util.Arrays;

/* ✅ In this Program Will convert an int array (array1) to int
 *   INPUT :[100,200,300,400]
 *   OUTPUT:100200300400
 *   
 *   Approach :
 * STEP 1:   In order to convert an Integer array to int first let's convert an int array to String 
 * STEP 2: After Converting t
 */

public class HowToConvertIntegerArrayToInteger {
	
// Method to Convert an integer array to integer
	private static int convertAnIntegerArrayToInteger(int[] array1) 
	{
		String ans=Arrays.toString(array1);
		System.out.println("Converted an Integer Array to Integer and here is array:"+ans);
		
		System.out.println("👍🏻 Now, lets remove the comma from the string");
		ans=ans.replaceAll("\\D", "");  // Here, //D is nothing but metachacter which is used to remove the Non-digit characters
		System.out.println("After removing comma from the string:"+ans);
		
		
		return 0;
	}
	// Main Method
	public static void main(String[] args) {
		int array1[]=new int[] {100,200,300,400};
		
		int result=convertAnIntegerArrayToInteger(array1);
		System.out.println(result);
		
	}


}
