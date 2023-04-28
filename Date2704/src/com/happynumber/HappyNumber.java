package com.happynumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {

		int n=82;
		boolean happyNumber = isHappyNumber(n);
		System.out.println(happyNumber);
	}


	private static boolean isHappyNumber(int n) {

		Set<Integer> usedIntegers=new HashSet<>();
		while(true) {
			int sum=0;
			while(n!=0) {
				sum+=Math.pow(n%10,2.0);
				n=n/10;
			}
			
			if(sum==1) return true;
			else {
				n=sum;
			}
			
			if(usedIntegers.contains(n)) return false;
			usedIntegers.add(n);
		}
		
	}

}
