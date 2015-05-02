package com.sha.algos.ds;

/**
 * Implement an alogorithim to determine if string has all unique characters. What if you
 * cannot use additional data structures
 * @author Shashwat
 */
public class UniqueChar {
	public static void main(String[] args) {
		String input1 = "Shashwat";
		String input2 = "abcde";
		System.out.println("Input string : " + input1 + " has unique characters : " + isUniqueChars(input1));
		System.out.println("Input string : " + input2 + " has unique characters : " + isUniqueChars(input2));
	}

	private static boolean isUniqueChars(String input) {
		if (input == null || input.length() > 128) {
			return false;
		}
		
		boolean[] set = new boolean[265];
		for (int index = 0; index < input.length(); index++) {
			int val = input.charAt(index);
			if (set[val]) {
				return false;
			}
			set[val] = true;
		}
		return true;
	}
}
