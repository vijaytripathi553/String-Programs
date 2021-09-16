package com.string.interview_programs;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseString {
	
	private static String reverseString(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=ch.length-1; i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	
		
		return s;
	}
//Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any String:");
		String s=sc.next();
		
		ReverseString.reverseString(s);
		
	}
}
