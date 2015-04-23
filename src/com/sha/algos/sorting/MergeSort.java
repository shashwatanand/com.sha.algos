package com.sha.algos.sorting;

public class MergeSort {
	private int[] numbers;
	private int[] helper;
	
	public static void main(String[] args) {
		int[] input = { 45, 23, 11, 89, 2, 77, 98, 13, 28, 65, 43 };
		MergeSort mergeSort = new MergeSort();

		mergeSort.sort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
	 
	
	public void sort(int[] vals) {
		this.numbers = vals;
		this.helper = new int[this.numbers.length];
		mergeSort(0, this.numbers.length - 1);
	}
	
	private void mergeSort(int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2; // low + (high - low) / 2;
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	private void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			this.helper[i] = this.numbers[i];
		}
		
		int i = low, j = mid + 1, k = low;

		while ((i <= mid) && (j <= high)) {
			if (this.helper[i] < this.helper[j]) {
				this.numbers[k++] = this.helper[i++];
			} else {
				this.numbers[k++] = this.helper[j++];
			}
		}

		while (i <= mid) {
			this.numbers[k++] = this.helper[i++];
		}
		while (j <= high) {
			this.numbers[k++] = this.helper[j++];
		}
	}

}
