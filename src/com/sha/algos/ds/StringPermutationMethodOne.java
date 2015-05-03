package com.sha.algos.ds;

import java.util.Arrays;

/**
 * Given the two string, write a method to decide if one is permutation of other
 * 
 * @author Shashwat
 */

public class StringPermutationMethodOne {
	public static void main(String[] args) {
		String str1 = "dbca";
		String str2 = "bcad";
		System.out.println("Is " + str1 + " and " + str2 + " are permutation of "
				+ "each other " + permutation(str1, str2));
	}
	
	public static String sort(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	private static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
}
