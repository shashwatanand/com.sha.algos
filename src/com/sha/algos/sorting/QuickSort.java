package com.sha.algos.sorting;

public class QuickSort {
	private int[] array;
	
	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();
		int[] input = { 45, 23, 11, 89, 2, 77, 98, 13, 28, 65, 43 };
		sorter.sort(input);
		for (int i : input) {
			System.out.println(i + " ");
		}
	}
}
