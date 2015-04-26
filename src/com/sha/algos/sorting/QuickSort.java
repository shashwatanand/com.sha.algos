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

	private void sort(int[] input) {
		if (input == null && input.length == 0) {
			return;
		}
		this.array = input;
		quickSort(0, this.array.length - 1);
	}

	private void quickSort(int low, int high) {
		int i = low;
		int j = high;
		
		int pivot = this.array[(low + high)/2];
		
		while (i <= j) {
			while(array[i] < pivot) {
				i++;
			}
			while(array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
	}
}
