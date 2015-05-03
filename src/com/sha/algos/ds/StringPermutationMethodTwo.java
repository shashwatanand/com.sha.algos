package com.sha.algos.ds;

/**
 * Given the two string, write a method to decide if one is permutation of other
 * 
 * @author Shashwat
 */

public class StringPermutationMethodTwo {
	public static void main(String[] args) {
		String str1 = "dbca";
		String str2 = "bcad";
		System.out.println("Is " + str1 + " and " + str2 + " are permutation of "
				+ "each other " + permutation(str1, str2));
	}

	private static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] letters = new int[256];
		char[] arr = str1.toCharArray();
		for (char c : arr) {
			letters[c]++;
		}
		
		for (int index = 0; index < str2.length(); index++) {
			int c = (int)str2.charAt(index);
			if (--letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
}
