package com.sha.algos.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] input = { 45, 23, 11, 89, 2, 77, 98, 13, 28, 65, 43 };
		insertionSort(input);
	}
	
	private static void insertionSort(int[] input) {
		for(int j = 1; j < input.length; j++) {
			int key = input[j];
			int i = j - 1;
			while((i > -1) && (input[i]) > key) {
				input[i + 1] = input[i];
				i--;
			}
			input[i + 1] = key;
		}
		displayArray(input);
	}

	private static void displayArray(int[] input) {
		for (int i : input) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
