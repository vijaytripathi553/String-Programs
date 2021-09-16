package com.string.interview_programs;

import java.util.Scanner;

public class Last2CharacterOfString {
	
	private static void findLast2Char(String s1)
	{
		
		
		for (int i = 0; i <s1.length(); i++) {
			
		}
		//.Last2CharacterOfString..out.println(s1.substring(-1, s1.length()-2));
		//return s1.substring(i,-1);
		System.out.print(s1.substring(s1.length()-1)+" ");
		System.out.print(s1.substring(s1.length()-2,s1.length()-1));
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String:");
		String s1=sc.next();
		
		
		 Last2CharacterOfString.findLast2Char(s1);
		//System.out.println(s);
	
}
}
