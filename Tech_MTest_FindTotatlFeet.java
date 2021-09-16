package com.string.interview_programs;

public class Tech_MTest_FindTotatlFeet {
	
	
	private static int findTotalFeet(int input1, int[] input2) {
		int f=0;
		int total=0;
		for (int i = 0; i < input1; i++) {
			
			if(input2[i]<12)
			{
				continue;
				//return flag;
				
			}
			else if(input2[i]>=12)
			{
				total=input2[i]/12;
				f=f+total;
				//System.out.println(total);
				
				
			}
			
		}
		return f;
	}

	// Main Method
	public static void main(String[] args) {
		
		int input1=5;
		int input2[]= {12,18,24,11,18};
		int result=findTotalFeet(input1,input2);
		System.out.println(result);
		
	}

	
}
