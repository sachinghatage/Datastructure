package com.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] a= {1,2,3,4};
		boolean containsDuplicate = containsDuplicate(a);
		System.out.println(containsDuplicate);
		
	}

	private static boolean containsDuplicate(int[] a) {

		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(a[i])) return true;
			set.add(a[i]);
		}
		return false;
	}

}
