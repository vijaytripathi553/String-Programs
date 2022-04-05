package com.log2base2.array;


/*
 *  🛑🛑🛑🛑 How to convert an String to byte[] array and vice versa ? 🛑🛑🛑🛑
 *  Ans. 
 *  This is how we convert an string to byte [] array
 *  
 *  STEP 1:  Created one String 
 *  
 *  	String convertStringToByteArray=new String("This is an example of Converting to Byte array conversion");
		
		byte b1[]=new byte[convertStringToByteArray.length()];
		
	 STEP 2:  Converted that string to byte[] array using getBytes() method.
	 
		b1=convertStringToByteArray.getBytes();
		
		🛑🛑🛑🛑OUTOUT🛑🛑🛑🛑
		[B@15db9742

		
 *  🛑🛑🛑🛑 How to convert  byte[] array to String ? 🛑🛑🛑🛑
 *  Ans.
 *  
 *  To convert byte array into String format correctly,
 *  ✔✔ 🤑🤑 We have to EXPLICITLY CREATE STRING OBJECT and assign the BYTE ARRAY to it. 🤑🤑✔✔
 *  	String s2=new String(convertStringToByteArray); 
 *  🛑🛑🛑🛑OUTOUT🛑🛑🛑🛑
 *  
 *  This is an example of Converting to Byte array conversion

 *  
 *  
 *  
 *  
 *  
 *  
 */


import java.util.Arrays;

public class HowToConvertStringToByteArray {
	// Main Method
	public static void main(String[] args) {
		 // STEP 1:  Created one String 
		String convertStringToByteArray=new String("This is an example of Converting to Byte array conversion");
		
		byte b1[]=new byte[convertStringToByteArray.length()];
		
		// STEP 2:  Converted that string to byte[] array using getBytes() method.
		b1=convertStringToByteArray.getBytes();
		System.out.println(Arrays.toString(b1));
		
		
		// STEP 1: Conversion from byte array to String
		String s2=new String(convertStringToByteArray); 
		System.out.println(s2);
		System.out.println(s2.length());
		
		
		 
		
	}

}
