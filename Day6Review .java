package com.hackerrank.thirtydayofcode;

// Write a program which will allow you you to insert 5 string values one after another, you have to store those value into an array and then display that array element

import java.util.Scanner;

public class Day6Review {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalTestCase=sc.nextInt();
		//Creating an array of size totalCase
		String array[]=new String[totalTestCase];
		for(int i=0; i<array.length;i++)
		{
			array[i]=sc.next();
			System.out.println(array[i]);
			
			
		}
		

	}

}
