package com.string.interview_programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Amiti {
	
	private static String findSomething(String s1,String s2)
	{
		int count=0;
		Map<String,Integer>map=new HashMap<String, Integer>();
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.contains(s2))
			{
				count++;
			}
				
				
			
		}
		
	
		return s3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
		String s2=sc.next();
		Amiti.findSomething(s1,s2);
		
		
		
	}

}
