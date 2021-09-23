package codehere.dsa.sortingalgorithms;

import java.util.Arrays;

public class MergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int n = a.length;
		int i = 0;
		int j = n - 1;
		System.out.println(Arrays.toString(a));
		mergeSort(a, i, j);
		System.out.println(Arrays.toString(a));
	}

	private static void mergeSort(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if (i != j) {
			int mid = (i + j) / 2;
			mergeSort(a, i, mid);
			mergeSort(a, mid + 1, j);
			merge(a, i, mid, j); // Merging two sorted portions (i -> m) & (m+1 -> j)
		}
	}

	// Deep understanding of this function.
	private static void merge(int[] a, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int tempArr[] = new int[end - start + 1];

		int i = start, j = mid + 1, k = 0;

		while (i <= mid && j <= end) {
			if (a[i] <= a[j]) {
				tempArr[k] = a[i];
				k++;
				i++;
			} else {
				tempArr[k] = a[j];
				k++;
				j++;
			}
		}

		while (i <= mid) {
			tempArr[k] = a[i];
			k++;
			i++;
		}

		while (j <= end) {
			tempArr[k] = a[j] - k++;
			j++;
		}

		for (i = start; i <= end; i++) {
			a[i] = tempArr[i - start];
		}
	}

}
