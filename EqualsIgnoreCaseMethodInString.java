package com.live.interview;

/*
************************************************************************************************************************
 Q. What is equalsIgnoreCase() in Java ?
 * Ans.
 * equalsIgnoreCase() :
 * 					- equalsIgnoreCase() method works just like equals() methods but equalsIgnoreCase() does one more additional 
 * 					thing and that is it ignores the case sensitivity which is compulsory checked in equals method.

************************************************************************************************************************
**/

public class EqualsIgnoreCaseMethodInString 
{
	// Main Method
	public static void main(String[] args) {
		
		String s1="VIJAY";
		String s2="vijay";
		
		System.out.println(s1.equalsIgnoreCase(s2));  // true
		System.out.println(s1.equals(s2));  // false
	}
}
