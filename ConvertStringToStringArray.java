package com.string.interview_programs;

import java.util.Iterator;

//Q.  How to convert a String into String array ?

// Ans.
//      i)Create an array with string type.
//      ii) Then split the given string using           string_name.split().
public class ConvertStringToStringArray {
	
	
	
	public static void main(String[] args) {
		//1st let's create one string
		String s="ABCZY";
		// Secondly, let's convert this string into string array
		String arr[]=s.split("");
		
		// 3rd Now let's iterate this array ele,ent using for loop
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		//System.out.println(a);
		
	}

}
