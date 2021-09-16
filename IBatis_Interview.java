package com.string.interview_programs;
import java.util.*;

public class IBatis_Interview {

	private static String m1(String s) {

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}
			if (count >= 1) {
				System.out.print(count+""+arr[i]);
				
				i += (count - 1);
			}
		}
		return s;
	
	}
	// Main Method
	public static void main(String[] args) {
		String s1 = "AAAABBBCDD";
		m1(s1);

	}

}
