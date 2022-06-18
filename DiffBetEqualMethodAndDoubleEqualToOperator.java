package com.live.interview;

/*	✅✅ 	What is the Difference between == and .equals() method in java ?
****************************************************************************************************************************
👍👍:   == operator is used for reference comparison (address comparison). It means == operator checks if both objects  point to the same memory location or not.


👍👍:   .equals() method is used for content comparison (in String class). It means .equals() method is used to check object value.

****************************************************************************************************************************
*/

public class DiffBetEqualMethodAndDoubleEqualToOperator 
{
	// Main Method
	public static void main(String[] args) 
	{
		// Test Case 1:								 *******************************************************************************************************************************
	String s1="Hello";							//   *	When we declare string without new operator then if contents of two									 							  *
	String s2="Hello";          				//	 * strings are same then no new instance is created rather second instance  starts pointing		
	System.out.println("From Test Case 1");
	System.out.println(s1==s2); // true				 *	to the existing object and that's why == operator returned true as s1 and s2 objects address is same in the memory																  *
	System.out.println(s1.equals(s2)); // true		 *******************************************************************************************************************************
	
	// Test Case 2:
	String s3=new String("How");				//	 ********************************************************************************************************************************		
	String s4=new String("How");				//   *	When we declare string without new operator then if contents of two	
	System.out.println("From Test Case 2");
	System.out.println(s3==s4); //false				 * strings are same then no new instance is created rather second instance  starts pointing	
	System.out.println(s3.equals(s4)); //true	     *	to the existing object and that's why == operator returned true as s1 and s2 objects address is same in the memory
	 											//	 *******************************************************************************************************************************
	// Test Case 3:
	Integer s5=10;
	Integer s6=10;
	System.out.println("From Test Case 3");
	System.out.println(s5==s6); // true
	System.out.println(s5.equals(s6)); // true
	
	// Test Case 4:
	System.out.println("From Test Case 4");
	Integer s7=new Integer(10);
	Integer s8=new Integer(10);
	System.out.println(s7==s8); // false
	System.out.println(s7.equals(s8)); // true

	}

}
