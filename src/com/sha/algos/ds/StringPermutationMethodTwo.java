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
}
