package sortingalgorithms;

public class InsertionSorting {

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print("\t");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 1, 5, 6, 4, 2, 7 };
		print(a);
		insertionSort(a, a.length);
		print(a);
	}

	private static void insertionSort(int[] a, int length) {
		// TODO Auto-generated method stub
		int i = 1;

		// iterate from 0th index to key and check for the smallest element than key in
		// 0-l
		while (i < a.length) {
			int value = a[i]; // initially consider i=1 's position as key
			int hole = i;

			// Let a = [3 1 5 6 4 2 7]
			// Split the given array into sorted and unsorted sub-arrays
			// Say 3 be sorted array & 1 5 6 4 2 7 be unsorted array. Let i=1 (processing
			// the unsorted array), hole=i (to
			// process the sorted array by comparing it with the unsorted sub-array
			// elements) & a[i] be the value to compare
			// with the sorted array and place them accordingly in the sorted sub-array. So,
			// move all the elements from
			// unsorted to sorted sub-array by placing it at the appropriate position.

			while (hole > 0 && a[hole - 1] > value) {
				a[hole] = a[hole - 1];
				hole--;
			}
			a[hole] = value;
			i++;
		}
	}

}
